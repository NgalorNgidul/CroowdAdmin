package com.croowd.ui.client.place;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

public class ApproveProject extends Place {
	String token;

	public ApproveProject(String token) {
		super();
		this.token = token;
	}

	public String getToken() {
		return token;
	}

	public static class Tokenizer implements PlaceTokenizer<ApproveProject> {

		@Override
		public ApproveProject getPlace(String token) {
			return new ApproveProject(token);
		}

		@Override
		public String getToken(ApproveProject place) {
			return place.getToken();
		}

	}

}
