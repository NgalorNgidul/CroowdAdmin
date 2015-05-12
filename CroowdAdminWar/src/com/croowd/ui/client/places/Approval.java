package com.croowd.ui.client.places;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

public class Approval extends Place {
	String token;

	public Approval(String token) {
		super();
		this.token = token;
	}

	public String getToken() {
		return token;
	}

	public static class Tokenizer implements PlaceTokenizer<Approval> {

		@Override
		public Approval getPlace(String token) {
			return new Approval(token);
		}

		@Override
		public String getToken(Approval place) {
			return place.getToken();
		}

	}

}
