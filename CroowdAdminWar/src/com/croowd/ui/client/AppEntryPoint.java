package com.croowd.ui.client;

import org.simbiosis.ui.gwt.client.SIMbiosisEntryPoint;

import com.google.gwt.core.client.GWT;

public class AppEntryPoint extends SIMbiosisEntryPoint {

	public AppEntryPoint(String moduleName) {
		super(moduleName);
	}

	@Override
	public void initialize() {
		AppFactory appFactory = GWT.create(AppFactory.class);
		appFactory.getMainForm().getLogoPanel().getElement().setInnerHTML("<em class=\"headerLogoBig\">Croowd</em>Admin");
		//
		AppHistoryMapper historyMapper = GWT.create(AppHistoryMapper.class);
		//
		setClientFactory(this, appFactory);
		setMapper(new AppActivityMapper(appFactory), historyMapper);
	}
}
