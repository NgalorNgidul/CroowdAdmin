package com.croowd.ui.client;

import org.simbiosis.ui.gwt.client.mvp.SIMbiosisClientFactory;

import com.croowd.ui.client.project.IApproveProject;
import com.croowd.ui.client.project.IProject;


public interface AppFactory extends SIMbiosisClientFactory {
	IProject getProjectForm();
	
	IApproveProject getApproveProjectForm();
}
