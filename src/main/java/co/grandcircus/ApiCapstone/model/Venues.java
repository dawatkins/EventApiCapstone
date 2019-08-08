package co.grandcircus.ApiCapstone.model;

public class Venues {

	// variable to hold the string for the name of a city from the City class
	private City city;
	// variable to hold the string for the name of a state from the State class
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
		return "Venues [city=" + city + ", state=" + state + ", name=" + name + "]";
	}

}
