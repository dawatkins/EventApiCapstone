package co.grandcircus.ApiCapstone;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
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
	public ModelAndView showIndex() {
		Set<String> cities = new HashSet<>();
		List<Events> allEvents = apiService.showAll();
		
		//System.out.println(allEvents.size());
		//System.out.println(allEvents);
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
			System.out.println(date);
			List<Events> allEvents = apiService.showAll();
			return new ModelAndView("list", "events", allEvents);
		} else if ((city == null || city.isEmpty()) && (date == null || date.isEmpty())) {

			List<Events> keywordEvents = apiService.showByKeyword(keyword);
			return new ModelAndView("list", "events", keywordEvents);
		} else if ((keyword == null || keyword.isEmpty()) && (date == null || date.isEmpty())) {
			List<Events> venueEvents = apiService.showByCity(city);
			return new ModelAndView("list", "events", venueEvents);
		} else {
			List<Events> dateEvents = apiService.showByDate(date);
			return new ModelAndView("list", "events", dateEvents);
		}

	}

}
