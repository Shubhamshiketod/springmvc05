package com.ashokit.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class WelcomeController {
	
	@GetMapping("/welcomeMsg")
	public ModelAndView display()
	{
		ModelAndView mav =new ModelAndView();
		mav.addObject("msg","WelCome To SpringBoot..!!");
		mav.setViewName("welcome");
		
		return mav;
		
	}
	
	@GetMapping("/greetmsg")
	public ModelAndView display_Greet()
	{
		ModelAndView mav =new ModelAndView();
		mav.addObject("msg","Good AfterNoon");
		mav.setViewName("welcome");
		
		return mav;
		
	}
	
	
	
	

}
