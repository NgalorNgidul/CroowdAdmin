package com.croowd.ui.client.place;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

public class MemberList extends Place {
	String token;

	public MemberList(String token) {
		super();
		this.token = token;
	}

	public String getToken() {
		return token;
	}

	public static class Tokenizer implements PlaceTokenizer<MemberList> {

		@Override
		public MemberList getPlace(String token) {
			return new MemberList(token);
		}

		@Override
		public String getToken(MemberList place) {
			return place.getToken();
		}

	}

}
