package co.grandcircus.ApiCapstone.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EventsEmbedded {
	
	@JsonProperty("venues")
	private List<Venues> venues;

	public EventsEmbedded() {}
	
	public List<Venues> getVenues() {
		return venues;
	}

	public void setVenues(List<Venues> venues) {
		this.venues = venues;
	}

	@Override
	public String toString() {
		 String formattedString = venues.toString()
			    .replace("[", "")  //remove the right bracket
			    .replace("]", "")  //remove the left bracket
			    .trim(); 
		 return formattedString;
	}
	
	
	
	
}
