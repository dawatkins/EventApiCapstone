package co.grandcircus.ApiCapstone.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Start {
	@JsonProperty("localDate")
	private String localDate;
	
	public String getLocalDate() {
		return localDate;
	}

	public void setLocalDate(String localDate) {
		this.localDate = localDate;
	}

	@Override
	public String toString() {
		return localDate;
	}
	
	
}
