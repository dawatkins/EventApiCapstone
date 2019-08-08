package co.grandcircus.ApiCapstone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EventsController {
	
	@Autowired
	private ApiService apiService;
	
	@RequestMapping("/")
	public ModelAndView showHome() {
		System.out.println("Test A: I made it here");
		return new ModelAndView("index", "events", apiService.showAll());
	}
}
