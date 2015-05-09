package com.croowd.ui.client.memberlist;

import java.util.ArrayList;
import java.util.List;

import com.croowd.ui.client.json.MemberJso;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;

public class MemberResultList extends Composite {

	MemberListForm parentForm;

	private static ProspectResultListUiBinder uiBinder = GWT
			.create(ProspectResultListUiBinder.class);

	interface ProspectResultListUiBinder extends
			UiBinder<Widget, MemberResultList> {
	}

	public class Mapper {
		Button button;
		MemberJso jso;

		public Mapper(Button button, MemberJso jso) {
			this.button = button;
			this.jso = jso;
		}

		public Button getButton() {
			return button;
		}

		public void setButton(Button button) {
			this.button = button;
		}

		public MemberJso getJso() {
			return jso;
		}

		public void setJso(MemberJso jso) {
			this.jso = jso;
		}

	}

	List<Mapper> buttons = new ArrayList<Mapper>();

	@UiField
	VerticalPanel prospectList;

	public MemberResultList() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	public void setParent(MemberListForm parentForm) {
		this.parentForm = parentForm;
	}

	public void addData(MemberJso data) {
		VerticalPanel vp = new VerticalPanel();
		vp.setStyleName("fullbox");
		HTMLPanel panel = new HTMLPanel("<b>" + data.getName() + "</b><br/>"
				+ data.getAddress() + ", " + data.getCity() + " "
				+ data.getZipCode() + ", " + data.getProvince() + "<br/><br/>");
		panel.setStyleName("itemline");
		vp.add(panel);
		Button btnReview = new Button("Lihat detail");
		btnReview.setStyleName("fieldbutton");
		buttons.add(new Mapper(btnReview, data));
		btnReview.addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {
				onClickHandler((Button) event.getSource());
			}
		});
		vp.add(btnReview);
		panel = new HTMLPanel("<div></div>");
		panel.setStyleName("itemlinespacer");
		vp.add(panel);
		prospectList.add(vp);
	}

	private void onClickHandler(Button button) {
		MemberJso result = null;
		int i = 0;
		while (i < buttons.size() && result == null) {
			if (buttons.get(i).getButton() == button) {
				result = buttons.get(i).getJso();
			}
			i++;
		}
		if (result != null) {
			parentForm.viewMember(result);
		}
	}

	public void clear() {
		prospectList.clear();
	}
}
