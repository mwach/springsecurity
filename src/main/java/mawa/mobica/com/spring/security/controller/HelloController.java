package mawa.mobica.com.spring.security.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping(value = { "/", "/welcome**" }, method = RequestMethod.GET)
	public ModelAndView welcomePage() {

		ModelAndView model = new ModelAndView();
		model.addObject("title", "Hello world");
		model.addObject("message", "welcome page");
		model.setViewName("hello");
		return model;
	}

	@RequestMapping(value = { "/admin**" }, method = RequestMethod.GET)
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	public ModelAndView adminPage() {

		ModelAndView model = new ModelAndView();
		model.addObject("title", "Admin page");
		model.addObject("message", "welcome on admin page");
		model.setViewName("admin");
		return model;
	}

	@RequestMapping(value = { "/dba**" }, method = RequestMethod.GET)
	public ModelAndView dbaPage() {

		ModelAndView model = new ModelAndView();
		model.addObject("title", "DBA page");
		model.addObject("message", "welcome on dba page");
		model.setViewName("admin");
		return model;
	}

}
