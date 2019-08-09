package co.grandcircus.ApiCapstone;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.ApiCapstone.model.Events;

@Controller
public class EventsController {

	@Autowired
	private ApiService apiService;
	public List<Events> allEvents;
	
	@RequestMapping("/")
	public ModelAndView showIndex() {
		Set<String> cities = new HashSet<>();
		allEvents = apiService.showAll();
		
		
		for (int i = 0; i < allEvents.size(); i++) {
			cities.add(allEvents.get(i).getDetails().getVenues().get(0).getCity().getName());
			
		}
		return new ModelAndView("index", "cities", cities);
	}

	@RequestMapping("/list")
	public ModelAndView showList(@RequestParam(value = "keyword", required = false) String keyword,
			@RequestParam(value = "city", required = false) String city,
			@RequestParam(value = "date", required = false) String date) {
		
		if ((keyword == null || keyword.isEmpty()) && (city == null || city.isEmpty())
				&& (date == null || date.isEmpty())) {
			

			return new ModelAndView("list", "events", allEvents);
		} else if ((city == null || city.isEmpty()) && (date == null || date.isEmpty())) {

			allEvents = apiService.showByKeyword(keyword);
			return new ModelAndView("list", "events", allEvents);
		} else if ((keyword == null || keyword.isEmpty()) && (date == null || date.isEmpty())) {
			allEvents = apiService.showByCity(city);
			return new ModelAndView("list", "events", allEvents);
		} else {
			allEvents = apiService.showByDate(date);
			return new ModelAndView("list", "events", allEvents);
		}

	}
	
	@GetMapping("/details/{id}")
	public ModelAndView showDetails(
			@PathVariable("id") String id) {
		
		List<Events> event = new ArrayList<>();

		for (int i = 0; i < allEvents.size(); i++) {
			if(id.equals(allEvents.get(i).getId())) {
				event.add(allEvents.get(i));
			}
		}	
		
		return new ModelAndView("details", "event", event);
	}

}
