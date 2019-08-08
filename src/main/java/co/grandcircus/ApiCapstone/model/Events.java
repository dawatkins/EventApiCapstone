package co.grandcircus.ApiCapstone.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Events {
	
	private String name;
	private String id;
	private String url;
	private Dates date;
	@JsonProperty("_embedded")
	private EventsEmbedded details;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Dates getDate() {
		return date;
	}
	public void setDate(Dates date) {
		this.date = date;
	}
	public EventsEmbedded getDetails() {
		return details;
	}
	public void setDetails(EventsEmbedded details) {
		this.details = details;
	}
	
	
	
}
