package com.croowd.ui.client.project;

import java.util.List;

import org.simbiosis.ui.gwt.client.mvp.SIMbiosisActivity;

import com.croowd.ui.shared.ProjectDv;
import com.google.gwt.user.client.ui.Widget;

public interface IProject {

	public void setActivity(Activity activity);

	public Widget getWidget();

	 List<ProjectDv> listProject(List<ProjectDv> datas);
	 public void addDataListProject();
	
	/*public void setCompanyData(CompanyDv data);
	
	public void viewCompany();

	public void editCompany();
*/
	public abstract class Activity extends SIMbiosisActivity {
		/*public abstract void editCompany();*/
	}
	
}
