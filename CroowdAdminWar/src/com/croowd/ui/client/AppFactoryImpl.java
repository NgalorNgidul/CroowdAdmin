package com.croowd.ui.client;

import org.simbiosis.ui.gwt.client.mvp.SIMbiosisClientFactoryImpl;

import com.croowd.ui.client.investlist.IInvestList;
import com.croowd.ui.client.investlist.InvestListForm;
import com.croowd.ui.client.memberlist.IMemberList;
import com.croowd.ui.client.memberlist.MemberListForm;
import com.croowd.ui.client.project.IProject;
import com.croowd.ui.client.project.ProjectForm;
import com.croowd.ui.client.prospectlist.IProspectList;
import com.croowd.ui.client.prospectlist.ProspectListForm;

public class AppFactoryImpl extends SIMbiosisClientFactoryImpl implements
		AppFactory {

	static final ProspectListForm PROSPECT_LIST = new ProspectListForm();
	static final MemberListForm MEMBER_LIST = new MemberListForm();
	static final ProjectForm PROJECT_FORM = new ProjectForm();
	static final InvestListForm INVEST_LIST = new InvestListForm();

	@Override
	public IProspectList getProspectList() {
		return PROSPECT_LIST;
	}

	@Override
	public IProject getProjectForm() {
		return PROJECT_FORM;
	}

	@Override
	public IMemberList getMemberList() {
		return MEMBER_LIST;
	}

	@Override
	public IInvestList getInvestList() {
		return INVEST_LIST;
	}

}
