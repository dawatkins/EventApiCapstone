package co.grandcircus.ApiCapstone;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.ApiCapstone.model.Events;

@Controller
public class EventsController {
	
	@Autowired
	private ApiService apiService;
	
	@RequestMapping("/")
	public ModelAndView showHome(
			@RequestParam(value = "keyword", required = false) String keyword,
			@RequestParam(value = "citye" , required = false) String city,
			@RequestParam(value = "date", required = false) String date) {
		List<Events> allEvents = apiService.showAll();
		
		if((keyword == null || keyword.isEmpty()) && (city == null || city.isEmpty()) && (date == null || date.isEmpty())) {
			return new ModelAndView("index", "events", allEvents);
		}else if((city == null || city.isEmpty()) && (date == null || date.isEmpty())){
		
			List<Events> keywordEvents = apiService.showByKeyword(keyword);
			return new ModelAndView("index", "events", keywordEvents);
		}else if((keyword == null || keyword.isEmpty()) && (date == null || date.isEmpty())) {
			List<Events> venueEvents = apiService.showByCity(city);
			return new ModelAndView("index", "events", venueEvents);
		}else {
			List<Events> dateEvents = apiService.showByDate(date);
			return new ModelAndView("index", "events", dateEvents);
		}
		
		
	}
	
	
}
