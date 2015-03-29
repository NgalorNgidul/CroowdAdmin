package com.croowd.ui.client;

import org.simbiosis.ui.gwt.client.mvp.SIMbiosisClientFactoryImpl;

import com.croowd.ui.client.project.ApproveProjectForm;
import com.croowd.ui.client.project.IApproveProject;
import com.croowd.ui.client.project.IProject;
import com.croowd.ui.client.project.ProjectForm;

public class AppFactoryImpl extends SIMbiosisClientFactoryImpl implements
		AppFactory {

	static final ProjectForm PROJECT_FORM = new ProjectForm();

	static final ApproveProjectForm APPROVE_PROJECT_FORM = new ApproveProjectForm();

	@Override
	public IProject getProjectForm() {
		return PROJECT_FORM;
	}

	@Override
	public IApproveProject getApproveProjectForm() {
		return APPROVE_PROJECT_FORM;
	}

}
