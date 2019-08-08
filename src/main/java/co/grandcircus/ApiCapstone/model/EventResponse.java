package co.grandcircus.ApiCapstone.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EventResponse {
	@JsonProperty("_embedded")
	private Embedded embedded;

	public Embedded getEmbedded() {
		return embedded;
	}

	public void setEmbedded(Embedded embedded) {
		this.embedded = embedded;
	}
	
}
