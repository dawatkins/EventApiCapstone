package co.grandcircus.ApiCapstone;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EventsController {

	private ApiService apiService;
	
	@RequestMapping("/")
	public ModelAndView showHome() {
		return new ModelAndView("index", "events", apiService.showAll());
	}
}
