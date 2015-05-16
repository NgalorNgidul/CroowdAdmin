package com.croowd.ui.client.prospectlist;

import com.croowd.ui.client.json.ProspectJso;
import com.croowd.ui.client.prospectlist.IProspectList.Activity;
import com.google.gwt.core.client.GWT;
import com.google.gwt.editor.client.Editor;
import com.google.gwt.editor.client.SimpleBeanEditorDriver;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.NumberLabel;
import com.google.gwt.user.client.ui.Widget;

public class ApprovalForm extends Composite implements Editor<ProspectJso> {

	Activity activity;

	private static ThisUiBinder uiBinder = GWT.create(ThisUiBinder.class);

	interface ThisUiBinder extends UiBinder<Widget, ApprovalForm> {
	}

	interface Driver extends SimpleBeanEditorDriver<ProspectJso, ApprovalForm> {
	}

	Driver driver = GWT.create(Driver.class);

	/*
	 * @UiField TabLayoutPanel viewCust;
	 */

	@UiField
	Label ownerName;
	@UiField
	Label email;
	@UiField
	Label address;
	@UiField
	Label city;
	@UiField
	Label zipCode;
	@UiField
	Label province;
	@UiField
	Label phone;
	@UiField
	Label title;
	@UiField
	Label location;
	@UiField
	NumberLabel<Double> principal;
	@UiField
	NumberLabel<Integer> tenor;
	@UiField
	Label description;

	@UiField
	Button btnApprove;
	@UiField
	Button btnReject;
	@UiField
	Button btnBack;

	public ApprovalForm() {
		initWidget(uiBinder.createAndBindUi(this));
		//
		driver.initialize(this);
	}

	public void setActivity(Activity activity) {
		this.activity = activity;
	}

	public void setData(ProspectJso data) {
		driver.edit(data);
	}

	@UiHandler("btnBack")
	void onBtnBack(ClickEvent e) {
		activity.onBack();
	}
	
	@UiHandler("btnApprove")
	void onBtnApprove(ClickEvent e) {
		ProspectJso data = driver.flush();
		activity.onApprove(data.getId());
	}

}
