package com.croowd.ui.client;

import org.simbiosis.ui.gwt.client.mvp.SIMbiosisActivityMapper;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.place.shared.Place;

public class AppActivityMapper extends SIMbiosisActivityMapper {

	public AppActivityMapper(AppFactory clientFactory) {
		super(clientFactory);
	}

	@Override
	public Activity dispatchActivity(Place place) {
		//
		AppFactory appFactory = (AppFactory) getClientFactory();
		//
		// if (place instanceof Pendaftaran) {
		// return new PendaftaranActivity((Pendaftaran) place, appFactory);
		// }
		return null;
	}

}
