package com.croowd.ui.client.investlist;

import com.croowd.ui.client.investlist.IInvestList.Activity;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.TextBox;
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
	TextBox value;

	public InvestEditorForm() {
		initWidget(uiBinder.createAndBindUi(this));
		//
		Button button = new Button("Cari Prospek");
		button.setStyleName("fieldbutton");
		button.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				//ProspectDlg dlg = new ProspectDlg();
				//dlg.center();
			}
		});
		prospectWidget.add(button);
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

}
