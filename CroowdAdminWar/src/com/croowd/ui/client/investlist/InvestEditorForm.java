package com.croowd.ui.client.investlist;

import com.croowd.ui.client.investlist.IInvestList.Activity;
import com.croowd.ui.client.json.InvestPlanJso;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.NumberLabel;
import com.google.gwt.user.client.ui.Widget;

public class InvestEditorForm extends Composite {

	Activity activity;

	private static InvestEditorFormUiBinder uiBinder = GWT
			.create(InvestEditorFormUiBinder.class);

	interface InvestEditorFormUiBinder extends
			UiBinder<Widget, InvestEditorForm> {
	}

	@UiField
	HorizontalPanel prospectWidget;
	@UiField
	Label memberName;
	@UiField
	NumberLabel<Double> value;

	InvestPlanJso invest;

	public InvestEditorForm() {
		initWidget(uiBinder.createAndBindUi(this));
		//
	}

	public void setActivity(Activity activity) {
		this.activity = activity;
	}

	@UiHandler("btnBack")
	void onBtnBack(ClickEvent e) {
		activity.onBack();
	}

	@UiHandler("btnSave")
	void onBtnSave(ClickEvent e) {
		activity.onSave();
	}

	public void setData(InvestPlanJso data) {
		//
		invest = data;
		//
		prospectWidget.clear();
		memberName.setText(data.getMemberName());
		value.setValue(data.getValue());
		ProspectViewerWidget form = new ProspectViewerWidget();
		form.setData(data.getProspect());
		prospectWidget.add(form);
	}
	
	public InvestPlanJso getData(){
		return invest;
	}
}
