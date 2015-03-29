package com.croowd.ui.client;

import com.google.gwt.core.client.EntryPoint;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class CroowdAdminWar implements EntryPoint {

	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {
		new AppEntryPoint(getClass().getSimpleName()).start();
	}
}
