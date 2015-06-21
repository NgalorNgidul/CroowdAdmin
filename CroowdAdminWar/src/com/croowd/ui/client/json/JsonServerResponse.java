package com.croowd.ui.client.json;

import com.google.gwt.core.client.JsArray;

public class JsonServerResponse {

	public static final native ProspectJso getRegistrationJso(
			String responseString) /*-{
		// You should be able to use a safe parser here
		// (like the one from json.org)
		return eval('(' + responseString + ')');
	}-*/;

	public static final native JsArray<MemberJso> listMemberJso(
			String responseString) /*-{
		return eval('(' + responseString + ')');
	}-*/;

	public static final native JsArray<ProspectJso> listProspectJso(
			String responseString) /*-{
		return eval('(' + responseString + ')');
	}-*/;

}
