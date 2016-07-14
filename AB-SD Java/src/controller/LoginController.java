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
		ModelAndView model1 = new ModelAndView("login");
		ModelAndView model2 = new ModelAndView("menu");
		
		UserDAO userDAO= new UserDAO();
		
		if(userDAO.isExist(user)) return model2;
		else{
			model1.addObject("message", "The email and password you entered don't match");
			return model1;
		}
	}
	
}
