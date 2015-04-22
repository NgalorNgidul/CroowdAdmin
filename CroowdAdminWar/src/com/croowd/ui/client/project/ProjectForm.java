package com.croowd.ui.client.project;

import java.util.ArrayList;
import java.util.List;

import com.croowd.ui.shared.ProjectDv;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HTMLTable;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;

public class ProjectForm extends Composite implements IProject {

	Activity activity;
	private static final int HeaderRowIndex = 0;
	
	 int rowIndex = 1;
	 
	 List<ProjectDv> listProjects;

	private static ThisUiBinder uiBinder = GWT.create(ThisUiBinder.class);

	interface ThisUiBinder extends UiBinder<Widget, ProjectForm> {
	}

	
	@UiField
	HorizontalPanel horPanel;
	
	
	@UiField
	FlexTable tableProject;
	
	@UiField
	TextBox txtSearch;
	
	@UiField
	Button btnSearch;
	
	
	
	public ProjectForm() {
		initWidget(uiBinder.createAndBindUi(this));
		listProjects = new ArrayList<ProjectDv>();
		initTableColumns();
		
		/*for (int row = 0; row < rowData.length; row++) {
		      addRow(rowData[row]);        
		    }*/
		
			
			setDataProjects(listProjects);
		    
			applyDataRowStyles();
		    
		    tableProject.setCellSpacing(0);
		    tableProject.addStyleName("FlexTable");  
		   
		    tableProject.addClickHandler(new ClickHandler() {
				
				@Override
				public void onClick(ClickEvent event) {
					/*int row = tableProject.getCellForEvent(event).getRowIndex();
					String f = tableProject.getCellForEvent(event).getElement().getInnerHTML();*/
					Window.Location.replace("/croowdAdmin/#ApproveProject:");
					
					
				}
			});
		    
		   
	}
	
	private void initTableColumns(){
		
		
		tableProject.insertRow(HeaderRowIndex);
		tableProject.getRowFormatter().addStyleName(HeaderRowIndex,"FlexTable-Header");
	
		addColumn("Nasabah Name");
		addColumn("CIF");
		addColumn("Date Assign");
		addColumn("Project Name" );
		addColumn("Nominal");
		addColumn("Status" );
		
		
		
				
	}
	
	private void addColumn(Object columnHeading) {
	    Widget widget = createCellWidget(columnHeading);
	    int cell = tableProject.getCellCount(HeaderRowIndex);
	    
	    widget.setWidth("100%");
	    widget.addStyleName("FlexTable-ColumnLabel");
	    
	    tableProject.setWidget(HeaderRowIndex, cell, widget);
	    
	    tableProject.getCellFormatter().addStyleName(
	        HeaderRowIndex, cell,"FlexTable-ColumnLabelCell");
	  }
	
	private Widget createCellWidget(Object cellObject) {
	    Widget widget = null;

	    if (cellObject instanceof Widget)
	      widget = (Widget) cellObject;
	    else
	      widget = new Label(cellObject.toString());

	    return widget;
	  }
	
	
	
	 
	 private void setDataProjects(List<ProjectDv> list){
		 
		// List<ProjectDv> projects = new ArrayList<>();
			for(int i = 1; i <10 ; i++){
				ProjectDv projectDv = new ProjectDv();
				projectDv.setCif("000000" + i);
				projectDv.setNasabah("CUSTOMER 000 " + i);
				projectDv.setNominalProject(i + "0000000000");
				projectDv.setProjectName("PROJECT 000 " + i);
				projectDv.setDateAssign("09/09/2015");
				projectDv.setStatus("WAITING APPROVE");
				listProjects.add(projectDv);
			}
			
		 
		 for(ProjectDv dv : listProjects){
			tableProject.setText(rowIndex, 0, dv.getNasabah());
			tableProject.setText(rowIndex, 1, dv.getCif());
			tableProject.setText(rowIndex, 2, dv.getDateAssign());
			tableProject.setText(rowIndex, 3, dv.getProjectName());
			tableProject.setText(rowIndex, 4, dv.getNominalProject());
			tableProject.setText(rowIndex, 5, dv.getStatus());
			rowIndex++;
		 }
		 
	 }
		  
		  private void applyDataRowStyles() {
		    HTMLTable.RowFormatter rf = tableProject.getRowFormatter();
		    
		    for (int row = 1; row < tableProject.getRowCount(); ++row) {
		      if ((row % 2) != 0) {
		        rf.addStyleName(row, "FlexTable-OddRow");
		      }
		      else {
		        rf.addStyleName(row, "FlexTable-EvenRow");
		      }
		    }
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
	public List<ProjectDv> listProject(List<ProjectDv> datas) {
		listProjects = datas;
		return datas;
	}

	@Override
	public void addDataListProject() {
	}

	
	
	
}
