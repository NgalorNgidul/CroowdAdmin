package com.croowd.ui.client.project;

import com.croowd.ui.client.AppFactory;
import com.croowd.ui.client.place.ApproveProject;
import com.croowd.ui.client.project.IApproveProject.Activity;
import com.croowd.ui.shared.ProjectDv;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.client.ui.AcceptsOneWidget;

public class ApproveProjectActivity extends  Activity {
	
	ApproveProject myPlace;
	AppFactory appFactory;
	
	
	

	public ApproveProjectActivity(ApproveProject myPlace, AppFactory appFactory) {
		super();
		setFactory(appFactory);
		this.myPlace = myPlace;
		this.appFactory = appFactory;
	}




	@Override
	public void start(AcceptsOneWidget panel, EventBus eventBus) {
		IApproveProject myForm = appFactory.getApproveProjectForm();
		myForm.setActivity(this);
		
		loadProjectData(myForm);
		
		panel.setWidget(myForm.getWidget());
	}
	
	private void loadProjectData(IApproveProject myForm){
	ProjectDv projectDv = new ProjectDv();
		projectDv.setNasabah("Ibnu athillah");
	    projectDv.setCif("1HHHHN11");
	    projectDv.setAddress("Jl. Sukamenanti RT.06 RW.11");
	    projectDv.setAddress1("Jl. Sukamenanti RT.06 RW.11");
	    projectDv.setDob("09 Maret 1987");
	    projectDv.setPob("Jakarta");
	    projectDv.setPhone("0909009909909");
	    
	    projectDv.setProjectName("Pembangunan Ruko");
	    myForm.setProjectData(projectDv);;
	    myForm.viewProject();
		
	}

	@Override
	public void editProject() {
		IApproveProject myForm = appFactory.getApproveProjectForm();
		myForm.editProject();;
		
	}

}
