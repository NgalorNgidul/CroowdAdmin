package com.croowd.ui.client;


import org.simbiosis.ui.gwt.client.mvp.SIMbiosisActivityMapper;

import com.croowd.ui.client.place.ApproveProject;
import com.croowd.ui.client.place.Project;
import com.croowd.ui.client.project.ApproveProjectActivity;
import com.croowd.ui.client.project.ProjectActivity;
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
		if (place instanceof Project) {
			return new ProjectActivity((Project) place, appFactory);
		}else if(place instanceof ApproveProject){
			return new ApproveProjectActivity((ApproveProject)place, appFactory);
		}
		return null;
	}

}
