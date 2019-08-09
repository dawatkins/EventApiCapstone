package co.grandcircus.ApiCapstone;

import java.util.*;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpHeaders;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import co.grandcircus.ApiCapstone.model.*;

@Component
public class ApiService {

	private RestTemplate restTemplate = new RestTemplate();
	//private String API_KEY = "7elxdku9GGG5k8j0Xm8KWdANDgecHMV0";
	
	{
	    // This configures the restTemplateWithUserAgent to include a User-Agent header with every HTTP
		// request. Some of the APIs in this demo have a bug where User-Agent is required.
		ClientHttpRequestInterceptor interceptor = (request, body, execution) -> {
	        request.getHeaders().add(HttpHeaders.USER_AGENT, "Spring");
	        return execution.execute(request, body);
	    };
	    restTemplate = new RestTemplateBuilder().additionalInterceptors(interceptor).build();
	}
	
	public List<Events> showAll(){
		
		//System.out.println("Test B: I made it here");
		String url = "https://app.ticketmaster.com/discovery/v2/events?apikey=7elxdku9GGG5k8j0Xm8KWdANDgecHMV0&locale=*";
		//System.out.println("Test C: I made it here");
		EventResponse response = restTemplate.getForObject(url, EventResponse.class);
		List<Events> ourList = response.getEmbedded().getEvents();
		//System.out.println(ourList);
		return ourList;
	}
	
	public List<Events> showByKeyword(String keyword){
		System.out.println("show by keyword");
		String url = "https://app.ticketmaster.com/discovery/v2/events?apikey=7elxdku9GGG5k8j0Xm8KWdANDgecHMV0&locale=*&keyword=" +keyword;
		
		EventResponse response = restTemplate.getForObject(url, EventResponse.class);
		List<Events> ourList = response.getEmbedded().getEvents();
		return ourList;
		
	}
	
	public List<Events> showByCity(String city){
		System.out.println("show by city");
		String url = "https://app.ticketmaster.com/discovery/v2/events?apikey=7elxdku9GGG5k8j0Xm8KWdANDgecHMV0&locale=*&city=" +city;
		
		EventResponse response = restTemplate.getForObject(url, EventResponse.class);
		List<Events> ourList = response.getEmbedded().getEvents();
		return ourList;
		
		
	}
	
public List<Events> showByDate(String date){
		System.out.println("show by date");
		String url = "https://app.ticketmaster.com/discovery/v2/events?apikey=7elxdku9GGG5k8j0Xm8KWdANDgecHMV0&locale=*&startDateTime=" +date +"T00:00:00Z";
		
		EventResponse response = restTemplate.getForObject(url, EventResponse.class);
		List<Events> ourList = response.getEmbedded().getEvents();
		return ourList;
		
		
	}
}
