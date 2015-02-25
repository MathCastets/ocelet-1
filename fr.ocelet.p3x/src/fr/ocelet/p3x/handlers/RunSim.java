package fr.ocelet.p3x.handlers;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationType;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.debug.ui.DebugUITools;
import org.eclipse.jdt.launching.IJavaLaunchConfigurationConstants;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.PlatformUI;

import fr.ocelet.p3x.PlatformSettings;

public class RunSim extends ModelCmdHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		IProject selectedProject = getSelectedProject();

		// Alarm if no project seem to be selected
		if (selectedProject == null) {
			MessageDialog
					.openWarning(PlatformUI.getWorkbench()
							.getActiveWorkbenchWindow().getShell(), "Warning",
							"Please select an element of the project you want to simulate.");
			return null;
		}


		/*
		 * Bug issue #48 : We have to locate the java source file that has the
		 * same name as the project, then pick up the folder name between "src/"
		 * and that java file and use it as being the package name.
		 */
		String packg = "fr/ocelet/model/"
				+ selectedProject.getName().toLowerCase();
		if (!selectedProject.getFolder("src/" + packg)
				.getFile(selectedProject.getName() + ".java").exists()) {
			MessageDialog.openWarning(PlatformUI.getWorkbench()
					.getActiveWorkbenchWindow().getShell(), "Warning",
					"Java entry function (main) not found in the \"src\" folder of \""
							+ selectedProject.getName() + "\".\n");
			return null;
		}

		// Generate a launch configuration file
		ILaunchManager manager = DebugPlugin.getDefault().getLaunchManager();
		ILaunchConfigurationType type = manager
				.getLaunchConfigurationType("org.eclipse.jdt.launching.localJavaApplication");

		ILaunchConfiguration[] configurations = null;
		ILaunchConfigurationWorkingCopy workingCopy = null;
		try {
			configurations = manager.getLaunchConfigurations(type);
		} catch (CoreException e1) {
			if (PlatformSettings.msgLevel >= PlatformSettings.VERBOSE)
				System.err
						.println("An error occured while preparing a launch configuration for this project");
			if (PlatformSettings.msgLevel >= PlatformSettings.DEBUG)
				e1.printStackTrace();
		}
		for (int i = 0; i < configurations.length; i++) {
			ILaunchConfiguration configuration = configurations[i];
			if (configuration.getName().equals(selectedProject.getName())) {
				try {
					configuration.delete();
				} catch (CoreException e) {
					if (PlatformSettings.msgLevel >= PlatformSettings.VERBOSE)
						System.err
								.println("An error occured while trying to remove an old launch configuration for this project");
					if (PlatformSettings.msgLevel >= PlatformSettings.DEBUG)
						e.printStackTrace();
				}
				break;
			}
		}

		try {
			workingCopy = type.newInstance(null, selectedProject.getName());

			workingCopy.setAttribute(
					IJavaLaunchConfigurationConstants.ATTR_PROJECT_NAME,
					selectedProject.getName());
			workingCopy.setAttribute(
					IJavaLaunchConfigurationConstants.ATTR_MAIN_TYPE_NAME,
					packg + "/" + selectedProject.getName());
			workingCopy.setAttribute(
					IJavaLaunchConfigurationConstants.ATTR_PROGRAM_ARGUMENTS,
					"");

			ILaunchConfiguration configuration = null;
			configuration = workingCopy.doSave();

			// Run
			DebugUITools.launch(configuration, ILaunchManager.RUN_MODE);

			// Refresh the platform views
			ResourcesPlugin.getWorkspace().getRoot()
					.refreshLocal(IResource.DEPTH_INFINITE, null);
		} catch (CoreException e) {
			if (PlatformSettings.msgLevel >= PlatformSettings.VERBOSE)
				System.err
						.println("An error occured while trying to create a launch configuration for this project");
			if (PlatformSettings.msgLevel >= PlatformSettings.DEBUG)
				e.printStackTrace();
		}
		return null;
	}

}