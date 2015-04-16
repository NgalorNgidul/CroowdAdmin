package com.croowd.ui.client;

import com.google.gwt.core.client.EntryPoint;


/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class CroowdAdmin implements EntryPoint  {

	@Override
	public void onModuleLoad() {
		new AppEntryPoint(getClass().getSimpleName()).start();;
		
	}

	
}
