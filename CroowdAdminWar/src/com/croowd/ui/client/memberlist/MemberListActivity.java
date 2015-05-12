package com.croowd.ui.client.memberlist;

import com.croowd.ui.client.AppFactory;
import com.croowd.ui.client.json.MemberJso;
import com.croowd.ui.client.memberlist.IMemberList.Activity;
import com.croowd.ui.client.places.MemberList;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsonUtils;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.http.client.Request;
import com.google.gwt.http.client.RequestBuilder;
import com.google.gwt.http.client.RequestCallback;
import com.google.gwt.http.client.RequestException;
import com.google.gwt.http.client.Response;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.AcceptsOneWidget;

public class MemberListActivity extends Activity {

	// String pattern = "dd-MM-yyyy"; /* your pattern here */
	// DefaultDateTimeFormatInfo info = new DefaultDateTimeFormatInfo();
	// DateTimeFormat dtf = new DateTimeFormat(pattern, info) {
	// }; // <= trick here

	MemberList myPlace;
	AppFactory appFactory;

	public MemberListActivity(MemberList myPlace, AppFactory appFactory) {
		super();
		setFactory(appFactory);
		this.myPlace = myPlace;
		this.appFactory = appFactory;
	}

	@Override
	public void start(AcceptsOneWidget panel, EventBus eventBus) {
		IMemberList myForm = appFactory.getMemberList();
		myForm.setActivity(this);
		//
		loadMember();
		//
		panel.setWidget(myForm.getWidget());
	}

	private void loadMember() {
		String url = "http://api.croowd.co.id/member/listAll/"
				+ appFactory.getStatus().getSession();

		RequestBuilder builder = new RequestBuilder(RequestBuilder.GET, url);
		try {
			builder.sendRequest(null, new RequestCallback() {
				public void onError(Request request, Throwable e) {
					Window.alert(e.getMessage());
				}

				public void onResponseReceived(Request request,
						Response response) {
					if (200 == response.getStatusCode()) {
						IMemberList myForm = appFactory.getMemberList();
						JsArray<MemberJso> projects = JsonUtils
								.<JsArray<MemberJso>> safeEval(response
										.getText());
						for (int i = 0; i < projects.length(); i++) {
							myForm.addData(projects.get(i));
						}
					} else {
						Window.alert("Received HTTP status code other than 200 : "
								+ response.getStatusText());
					}
				}
			});
		} catch (RequestException e) {
			// Couldn't connect to server
			Window.alert(e.getMessage());
		}
	}

	@Override
	public void onBack() {
		IMemberList myForm = appFactory.getMemberList();
		myForm.backToList();
	}

//	private void reloadData() {
//		IMemberList myForm = appFactory.getMemberList();
//		myForm.reloadList();
//		loadMember();
//	}

}
