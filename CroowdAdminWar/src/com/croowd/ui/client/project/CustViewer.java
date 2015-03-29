package com.croowd.ui.client.project;


import org.simbiosis.ui.gwt.client.editor.ViewerForm;






import com.croowd.ui.client.project.IApproveProject.Activity;
import com.croowd.ui.shared.ProjectDv;
import com.google.gwt.core.client.GWT;
import com.google.gwt.editor.client.Editor;
import com.google.gwt.editor.client.SimpleBeanEditorDriver;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;

public class CustViewer extends ViewerForm<ProjectDv> implements Editor<ProjectDv> {

	Activity activity;
	
	
	interface ThisUiBinder extends UiBinder<Widget, CustViewer> {
	}
	
	private static ThisUiBinder uiBinder = GWT.create(ThisUiBinder.class);

	
	interface Driver extends SimpleBeanEditorDriver<ProjectDv, CustViewer>{
	}
	Driver driver = GWT.create(Driver.class);

	
	@UiField
	Label nasabah;

	@UiField
	Label cif;
	
	public CustViewer() {
		initWidget(uiBinder.createAndBindUi(this));
		//
		driver.initialize(this);
		driver.edit(new ProjectDv());
	}

	public void setActivity(Activity activity) {
		this.activity = activity;
	}

	@Override
	public void view(ProjectDv data) {
		driver.edit(data);
		
	}
}
