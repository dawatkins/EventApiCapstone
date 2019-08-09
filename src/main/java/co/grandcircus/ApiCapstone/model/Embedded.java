
package co.grandcircus.ApiCapstone.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Embedded {
	
	@JsonProperty("events")
	private List<Events> events;

	public List<Events> getEvents() {
		return events;
	}

	public void setEvents(List<Events> events) {
		this.events = events;
	}

	@Override
	public String toString() {
		return "Embedded [events=" + events + "]";
	}
	
	
}
