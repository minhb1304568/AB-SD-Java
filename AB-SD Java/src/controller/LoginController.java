package controller;

import model.User;
import dao.*;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/login")
public class LoginController {
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public ModelAndView initialLoginForm() {
		ModelAndView model = new ModelAndView("login");
		model.addObject("User", new User());
		
		return model;
	}
	
	@RequestMapping(value = "/index", method = RequestMethod.POST)
	public ModelAndView handleLoginForm(@ModelAttribute("User") User user) {
		ModelAndView model = new ModelAndView("login");
		model.addObject("User", new User());
		
		
		return model;
	}
	
}
