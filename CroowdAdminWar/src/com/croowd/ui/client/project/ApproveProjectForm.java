package com.croowd.ui.client.project;

import com.croowd.ui.shared.ProjectDv;
import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;


public class ApproveProjectForm extends Composite implements IApproveProject{

	Activity activity;
	
	private static ThisUiBinder uiBinder = GWT.create(ThisUiBinder.class);

	interface ThisUiBinder extends UiBinder<Widget, ApproveProjectForm> {
	}
	
	
	
	
	ProjectDv projectDv;
	
/*	@UiField
	TabLayoutPanel viewCust;*/
	
	@UiField
	Label nasabah;
	@UiField
	Label cif;
	@UiField
	Label pob;
	@UiField
	Label dob;
	@UiField
	Label address;
	@UiField
	Label address1;
	@UiField
	Label phone;
	@UiField
	Label projectName;
	
	
	@UiField
	Button approve;
	@UiField
	Button reject;
	
	
	public ApproveProjectForm() {
		initWidget(uiBinder.createAndBindUi(this));
		
		projectDv = new ProjectDv();
	}

	@Override
	public void setActivity(Activity activity) {
		this.activity = activity;	
		
	}

	@Override
	public Widget getWidget() {
		return this;
	}

	@Override
	public void setProjectData(ProjectDv data) {
		System.out.println("dataku :" + data.getCif());
		projectDv = data;
		
		nasabah.setText(projectDv.getNasabah());
		cif.setText(projectDv.getCif());
		pob.setText(projectDv.getPob());
		dob.setText(projectDv.getDob());
		address.setText(projectDv.getAddress());
		address1.setText(projectDv.getAddress1());
		phone.setText(projectDv.getPhone());
		dob.setText(projectDv.getDob());
		
		projectName.setText(projectDv.getProjectName());
	}

	@Override
	public void viewProject() {
	}

	@Override
	public void editProject() {
	}

	

	




}
