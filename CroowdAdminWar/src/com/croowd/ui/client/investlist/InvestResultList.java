package com.croowd.ui.client.investlist;

import com.croowd.ui.client.json.InvestPlanJso;
import com.croowd.ui.client.json.ProspectJso;
import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;

public class InvestResultList extends Composite {

	InvestListForm parentForm;

	private static ProspectResultListUiBinder uiBinder = GWT
			.create(ProspectResultListUiBinder.class);

	interface ProspectResultListUiBinder extends
			UiBinder<Widget, InvestResultList> {
	}

	// public class Mapper {
	// Button button;
	// ProspectJso jso;
	//
	// public Mapper(Button button, ProspectJso jso) {
	// this.button = button;
	// this.jso = jso;
	// }
	//
	// public Button getButton() {
	// return button;
	// }
	//
	// public void setButton(Button button) {
	// this.button = button;
	// }
	//
	// public ProspectJso getJso() {
	// return jso;
	// }
	//
	// public void setJso(ProspectJso jso) {
	// this.jso = jso;
	// }
	//
	// }
	//
	// List<Mapper> buttons = new ArrayList<Mapper>();

	@UiField
	VerticalPanel prospectList;

	public InvestResultList() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	public void setParent(InvestListForm parentForm) {
		this.parentForm = parentForm;
	}

	public void clearData() {
		prospectList.clear();
	}

	public void addData(InvestPlanJso invest) {
		ProspectJso data = invest.getProspect();
		VerticalPanel vp = new VerticalPanel();
		vp.setStyleName("fullbox");
		HTMLPanel panel = new HTMLPanel("<b>" + data.getTitle()
				+ "</b> oleh <b>" + data.getOwnerName()
				+ "</b><br/>Kebutuhan : Rp " + data.getPrincipal()
				+ ",-, Tenor : " + data.getTenor() + " bulan<br/>"
				+ data.getDescription() + "<br/><br/>Investor : "
				+ invest.getMemberName() + "<br/>Investasi : Rp "
				+ invest.getValue() + "<br/><br/>");
		panel.setStyleName("itemline");
		vp.add(panel);
		Button btnReview = new Button("Lihat detail");
		btnReview.setStyleName("fieldbutton");
		// buttons.add(new Mapper(btnReview, data));
		// btnReview.addClickHandler(new ClickHandler() {
		//
		// @Override
		// public void onClick(ClickEvent event) {
		// onClickHandler((Button) event.getSource());
		// }
		// });
		vp.add(btnReview);
		panel = new HTMLPanel("<div></div>");
		panel.setStyleName("itemlinespacer");
		vp.add(panel);
		prospectList.add(vp);
	}

	public void noData() {
		prospectList.clear();
		VerticalPanel vp = new VerticalPanel();
		vp.setStyleName("fullbox");
		HTMLPanel panel = new HTMLPanel(
				"Tidak ada investasi yang harus di validasi.");
		panel.setStyleName("itemline");
		vp.add(panel);
		prospectList.add(vp);
	}

	// private void onClickHandler(Button button) {
	// ProspectJso result = null;
	// int i = 0;
	// while (i < buttons.size() && result == null) {
	// if (buttons.get(i).getButton() == button) {
	// result = buttons.get(i).getJso();
	// }
	// i++;
	// }
	// if (result != null) {
	// parentForm.editProspect(result);
	// }
	// }

}
