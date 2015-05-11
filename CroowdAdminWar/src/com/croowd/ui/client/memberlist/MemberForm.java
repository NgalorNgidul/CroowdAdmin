package com.croowd.ui.client.memberlist;

import com.croowd.ui.client.json.MemberJso;
import com.croowd.ui.client.memberlist.IMemberList.Activity;
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
import com.google.gwt.user.client.ui.Widget;

public class MemberForm extends Composite implements Editor<MemberJso> {

	Activity activity;

	private static ThisUiBinder uiBinder = GWT.create(ThisUiBinder.class);

	interface ThisUiBinder extends UiBinder<Widget, MemberForm> {
	}

	interface Driver extends SimpleBeanEditorDriver<MemberJso, MemberForm> {
	}

	Driver driver = GWT.create(Driver.class);

	/*
	 * @UiField TabLayoutPanel viewCust;
	 */

	@UiField
	Label name;
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
	Button btnBack;

	public MemberForm() {
		initWidget(uiBinder.createAndBindUi(this));
		//
		driver.initialize(this);
	}

	public void setActivity(Activity activity) {
		this.activity = activity;
	}

	public void setData(MemberJso data) {
		driver.edit(data);
	}

	@UiHandler("btnBack")
	void onBtnBack(ClickEvent e) {
		activity.onBack();
	}

}
