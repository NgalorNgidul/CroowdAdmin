package com.croowd.ui.client.project;

import java.util.ArrayList;
import java.util.List;

import com.croowd.ui.client.AppFactory;
import com.croowd.ui.client.places.Project;
import com.croowd.ui.client.project.IProject.Activity;
import com.croowd.ui.shared.ProjectDv;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.client.ui.AcceptsOneWidget;

public class ProjectActivity extends Activity {

	Project myPlace;
	AppFactory appFactory;
	
	
	
	public ProjectActivity(Project myPlace, AppFactory appFactory) {
		super();
		setFactory(appFactory);
		this.myPlace = myPlace;
		this.appFactory = appFactory;
	}



	@Override
	public void start(AcceptsOneWidget panel, EventBus eventBus) {
		IProject myForm = appFactory.getProjectForm();
		myForm.setActivity(this);
		loadDataProejctsDv(myForm);
		panel.setWidget(myForm.getWidget());
	}
	
	private void loadDataProejctsDv(IProject myForm){
		List<ProjectDv> projects = new ArrayList<>();
		for(int i = 10; i <11 ; i++){
			ProjectDv projectDv = new ProjectDv();
			projectDv.setCif("000000" + i);
			projectDv.setNasabah("CUSTOMER 000 " + i);
			projectDv.setNominalProject(i + "0000000000");
			projectDv.setProjectName("PROJECT 000 " + i);
			projectDv.setDateAssign("09/09/2015");
			projectDv.setStatus("WAITING APPROVE");
			projects.add(projectDv);
		}
		
		myForm.listProject(projects);
		
	}

}
