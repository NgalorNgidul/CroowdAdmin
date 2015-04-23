package com.croowd.ui.client;

import org.simbiosis.ui.gwt.client.mvp.SIMbiosisClientFactoryImpl;

import com.croowd.ui.client.project.IProject;
import com.croowd.ui.client.project.ProjectForm;
import com.croowd.ui.client.prospectlist.IProspectList;
import com.croowd.ui.client.prospectlist.ProspectListForm;

public class AppFactoryImpl extends SIMbiosisClientFactoryImpl implements
		AppFactory {

	static final ProspectListForm PROSPECT_LIST = new ProspectListForm();
	static final ProjectForm PROJECT_FORM = new ProjectForm();

	@Override
	public IProspectList getProspectList() {
		return PROSPECT_LIST;
	}

	@Override
	public IProject getProjectForm() {
		return PROJECT_FORM;
	}

}
