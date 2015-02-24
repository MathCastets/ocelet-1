package fr.ocelet.p3x;

import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;
import org.eclipse.ui.console.IConsoleConstants;

/**
 * 
 * @author Rémi Tylski - Initial contribution
 * @author Pascal Degenne - Adapted for v1.1
 *
 */
public class Perspective implements IPerspectiveFactory {

	public void createInitialLayout(IPageLayout layout) {
		defineActions(layout);
		defineLayout(layout);
	}

	public void defineActions(IPageLayout layout) {
        // Add "new wizards".
        layout.addNewWizardShortcut("org.eclipse.ui.wizards.new.folder");
        layout.addNewWizardShortcut("org.eclipse.ui.wizards.new.file");

        // Add "show views".
        layout.addShowViewShortcut("fr.ocelet.p3x.views.navigator");
        layout.addShowViewShortcut(IPageLayout.ID_OUTLINE);
        layout.addShowViewShortcut(IConsoleConstants.ID_CONSOLE_VIEW);
//        layout.addShowViewShortcut("fr.ocelet.p3x.views.Problems");
	}

	
	public void defineLayout(IPageLayout layout) {

		String editorArea = layout.getEditorArea();
		layout.setEditorAreaVisible(true);

		IFolderLayout left = layout.createFolder("left", IPageLayout.LEFT,
				0.25f, editorArea);
		IFolderLayout bottom = layout.createFolder("bottom",
				IPageLayout.BOTTOM, 0.8f, editorArea);
		IFolderLayout right = layout.createFolder("right", IPageLayout.RIGHT,
				0.75f, editorArea);

		left.addView("fr.ocelet.p3x.views.navigator");
		right.addView(IPageLayout.ID_OUTLINE);
		bottom.addView(IConsoleConstants.ID_CONSOLE_VIEW);
//		bottom.addView("fr.ocelet.p3x.views.Problems");

		// set static views:
		layout.getViewLayout("fr.ocelet.p3x.views.navigator")
				.setCloseable(false);
		layout.getViewLayout(IPageLayout.ID_OUTLINE).setCloseable(false);
		layout.getViewLayout(IConsoleConstants.ID_CONSOLE_VIEW).setCloseable(
				false);
//		layout.getViewLayout("fr.ocelet.p3x.views.Problems").setCloseable(false);
	}

}
