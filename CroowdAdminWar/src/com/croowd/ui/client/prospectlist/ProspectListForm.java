package com.croowd.ui.client.prospectlist;

import org.simbiosis.ui.gwt.client.SIMbiosisStatus;

import com.croowd.ui.client.json.ProspectJso;
import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;

public class ProspectListForm extends Composite implements IProspectList {

	Activity activity;
	SIMbiosisStatus status;

	private static ThisUiBinder uiBinder = GWT.create(ThisUiBinder.class);

	interface ThisUiBinder extends UiBinder<Widget, ProspectListForm> {
	}

	@UiField
	VerticalPanel appPanel;

	ProspectResultList resultList = new ProspectResultList();
	ApprovalForm approvalForm = new ApprovalForm();

	public ProspectListForm() {
		initWidget(uiBinder.createAndBindUi(this));
		//
	}

	@Override
	public void setActivity(Activity activity, SIMbiosisStatus status) {
		this.activity = activity;
		this.status = status;
		//
		resultList.setParent(this,status);
		appPanel.add(resultList);
		//
		approvalForm.setActivity(activity);
		//
	}

	@Override
	public Widget getWidget() {
		return this;
	}

	@Override
	public void addData(ProspectJso data) {
		resultList.addData(data);
	}

	@Override
	public void reviewProspect(ProspectJso data) {
		appPanel.clear();
		approvalForm.setData(data);
		appPanel.add(approvalForm);
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

	SIMbiosisStatus getStatus() {
		return status;
	}
}
