package com.croowd.ui.client;

import org.simbiosis.ui.gwt.client.mvp.SIMbiosisActivityMapper;

import com.croowd.ui.client.memberlist.MemberListActivity;
import com.croowd.ui.client.place.MemberList;
import com.croowd.ui.client.place.ProspectList;
import com.croowd.ui.client.prospectlist.ProspectListActivity;
import com.google.gwt.activity.shared.Activity;
import com.google.gwt.place.shared.Place;

public class AppActivityMapper extends SIMbiosisActivityMapper {

	public AppActivityMapper(AppFactory clientFactory) {
		super(clientFactory);
	}

	@Override
	public Activity dispatchActivity(Place place) {
		AppFactory appFactory = (AppFactory) getClientFactory();
		//
		if (place instanceof ProspectList) {
			return new ProspectListActivity((ProspectList) place, appFactory);
		} else if (place instanceof MemberList) {
			return new MemberListActivity((MemberList) place, appFactory);
		}
		return null;
	}

}
