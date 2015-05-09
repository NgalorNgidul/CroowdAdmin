package com.croowd.ui.client.memberlist;

import com.croowd.ui.client.json.MemberJso;
import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;

public class MemberListForm extends Composite implements IMemberList {

	Activity activity;

	private static ThisUiBinder uiBinder = GWT.create(ThisUiBinder.class);

	interface ThisUiBinder extends UiBinder<Widget, MemberListForm> {
	}

	@UiField
	VerticalPanel appPanel;

	MemberResultList resultList = new MemberResultList();

	// ApprovalForm approvalForm = new ApprovalForm();

	public MemberListForm() {
		initWidget(uiBinder.createAndBindUi(this));
		//
		resultList.setParent(this);
		appPanel.add(resultList);
	}

	@Override
	public void setActivity(Activity activity) {
		this.activity = activity;
		//
		// approvalForm.setActivity(activity);
	}

	@Override
	public Widget getWidget() {
		return this;
	}

	@Override
	public void addData(MemberJso data) {
		resultList.addData(data);
	}

	@Override
	public void viewMember(MemberJso data) {
		appPanel.clear();
		// approvalForm.setData(data);
		// appPanel.add(approvalForm);
	}

	@Override
	public void backToList() {
		appPanel.clear();
		appPanel.add(resultList);
	}

	@Override
	public void reloadList() {
		appPanel.clear();
		appPanel.add(resultList);
		resultList.clear();
	}

}
