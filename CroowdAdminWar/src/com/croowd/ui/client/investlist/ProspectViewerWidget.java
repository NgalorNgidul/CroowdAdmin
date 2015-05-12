package com.croowd.ui.client.investlist;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class ProspectViewerWidget extends Composite {

	private static ProspectViewerWidgetUiBinder uiBinder = GWT
			.create(ProspectViewerWidgetUiBinder.class);

	interface ProspectViewerWidgetUiBinder extends
			UiBinder<Widget, ProspectViewerWidget> {
	}

	public ProspectViewerWidget() {
		initWidget(uiBinder.createAndBindUi(this));
	}

}
