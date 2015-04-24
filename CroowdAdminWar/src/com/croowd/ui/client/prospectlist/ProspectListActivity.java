package com.croowd.ui.client.prospectlist;

import com.croowd.ui.client.AppFactory;
import com.croowd.ui.client.json.ProspectJso;
import com.croowd.ui.client.place.ProspectList;
import com.croowd.ui.client.prospectlist.IProspectList.Activity;
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

public class ProspectListActivity extends Activity {

	// String pattern = "dd-MM-yyyy"; /* your pattern here */
	// DefaultDateTimeFormatInfo info = new DefaultDateTimeFormatInfo();
	// DateTimeFormat dtf = new DateTimeFormat(pattern, info) {
	// }; // <= trick here

	ProspectList myPlace;
	AppFactory appFactory;

	public ProspectListActivity(ProspectList myPlace, AppFactory appFactory) {
		super();
		setFactory(appFactory);
		this.myPlace = myPlace;
		this.appFactory = appFactory;
	}

	@Override
	public void start(AcceptsOneWidget panel, EventBus eventBus) {
		IProspectList myForm = appFactory.getProspectList();
		myForm.setActivity(this);
		//
		loadProspect();
		//
		panel.setWidget(myForm.getWidget());
	}

	private void loadProspect() {
		String url = "http://api.croowd.co.id/prospect/"
				+ appFactory.getStatus().getSession() + "/listAll/";

		RequestBuilder builder = new RequestBuilder(RequestBuilder.GET, url);
		try {
			builder.sendRequest(null, new RequestCallback() {
				public void onError(Request request, Throwable e) {
					Window.alert(e.getMessage());
				}

				public void onResponseReceived(Request request,
						Response response) {
					if (200 == response.getStatusCode()) {
						IProspectList myForm = appFactory.getProspectList();
						JsArray<ProspectJso> projects = JsonUtils
								.<JsArray<ProspectJso>> safeEval(response
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
		IProspectList myForm = appFactory.getProspectList();
		myForm.backToList();
	}

	@Override
	public void onApprove() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onReject() {
		// TODO Auto-generated method stub
		
	}

}