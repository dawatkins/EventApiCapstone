package co.grandcircus.ApiCapstone.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Dates {
	
	@JsonProperty("start")
	private Start startDate;

	public Start getStartDate() {
		return startDate;
	}

	public void setStartDate(Start startDate) {
		this.startDate = startDate;
	}

	@Override
	public String toString() {
		return startDate.toString();
	}
	
	
	
}
