/*
*  Ocelet spatial modelling language.   www.ocelet.org
*  Copyright Cirad 2010-2016
*
*  This software is a domain specific programming language dedicated to writing
*  spatially explicit models and performing spatial dynamics simulations.
*
*  This software is governed by the CeCILL license under French law and
*  abiding by the rules of distribution of free software.  You can  use,
*  modify and/ or redistribute the software under the terms of the CeCILL
*  license as circulated by CEA, CNRS and INRIA at the following URL
*  "http://www.cecill.info".
*  As a counterpart to the access to the source code and  rights to copy,
*  modify and redistribute granted by the license, users are provided only
*  with a limited warranty  and the software's author,  the holder of the
*  economic rights,  and the successive licensors  have only limited
*  liability.
*  The fact that you are presently reading this means that you have had
*  knowledge of the CeCILL license and that you accept its terms.
*/

package fr.ocelet.platform;

/**
 * General version and debug settings of the Ocelet Modelling Platform
 *
 * @author Pascal Degenne - Initial contribution
 *
 */
public class PlatformSettings {

	public final static String version = "1.2.0 - Beta";

	public final static int NORMAL = 0;
	public final static int VERBOSE = 1;
	public final static int DEBUG = 2;

	public static int msgLevel=DEBUG;

	public static int getMsgLevel() {
		return msgLevel;
	}

	public static void setMsgLevel(int msgLevel) {
		PlatformSettings.msgLevel = msgLevel;
	}

	public PlatformSettings() {
		msgLevel = NORMAL;
	}
}
