package com.croowd.ui.client.project;

import org.simbiosis.ui.gwt.client.mvp.SIMbiosisActivity;

import com.croowd.ui.shared.ProjectDv;
import com.google.gwt.user.client.ui.Widget;

public interface IApproveProject {

	public void setActivity(Activity activity);

	public Widget getWidget();

	public void setProjectData(ProjectDv data);

	public void viewProject();
	
	public void editProject();

	public abstract class Activity extends SIMbiosisActivity {
		public abstract void editProject();
	}
}
