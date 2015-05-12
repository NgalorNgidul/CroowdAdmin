package com.croowd.ui.client;

import org.simbiosis.ui.gwt.client.mvp.SIMbiosisClientFactory;

import com.croowd.ui.client.investlist.IInvestList;
import com.croowd.ui.client.memberlist.IMemberList;
import com.croowd.ui.client.project.IProject;
import com.croowd.ui.client.prospectlist.IProspectList;

public interface AppFactory extends SIMbiosisClientFactory {
	IProspectList getProspectList();

	IMemberList getMemberList();

	IProject getProjectForm();

	IInvestList getInvestList();

}
