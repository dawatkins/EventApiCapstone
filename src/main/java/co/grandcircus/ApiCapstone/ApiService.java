package co.grandcircus.ApiCapstone;

import java.util.*;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import co.grandcircus.ApiCapstone.model.*;

@Component
public class ApiService {

	private RestTemplate restTemplate;
	//private String API_KEY = "7elxdku9GGG5k8j0Xm8KWdANDgecHMV0";
	
	public List<Events> showAll(){
		String url = "https://app.ticketmaster.com/discovery/v2/events?apikey=7elxdku9GGG5k8j0Xm8KWdANDgecHMV0&locale=*";
		
		EventResponse response = restTemplate.getForObject(url, EventResponse.class);
		List<Events> ourList = response.getEmbedded().getEvents();
		return ourList;
	}
	
	
}
