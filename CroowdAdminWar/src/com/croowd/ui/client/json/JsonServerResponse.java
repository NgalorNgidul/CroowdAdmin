package com.croowd.ui.client.json;

public class JsonServerResponse {

	public static final native ProspectJso getRegistrationJso(
			String responseString) /*-{
		// You should be able to use a safe parser here
		// (like the one from json.org)
		return eval('(' + responseString + ')');
	}-*/;

}
