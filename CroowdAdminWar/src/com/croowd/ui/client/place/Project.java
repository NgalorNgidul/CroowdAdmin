package com.croowd.ui.client.place;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

public class Project extends Place {
	String token;

	public Project(String token) {
		super();
		this.token = token;
	}

	public String getToken() {
		return token;
	}

	public static class Tokenizer implements PlaceTokenizer<Project> {

		@Override
		public Project getPlace(String token) {
			return new Project(token);
		}

		@Override
		public String getToken(Project place) {
			return place.getToken();
		}

	}

}
