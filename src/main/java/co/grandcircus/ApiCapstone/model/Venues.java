package co.grandcircus.ApiCapstone.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Venues {

	// variable to hold the string for the name of a city from the City class
	@JsonProperty("city")
	private City city;
	// variable to hold the string for the name of a state from the State class
	@JsonProperty("state")
	private State state;
	// actual name of the venue where the event is being hosted
	private String name;

	public Venues() {
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name + " in: " + city + ", " + state;
	}

}
