package com.project.burari.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@CrossOrigin
public class MainController {
	
	@RequestMapping(value="/", method = RequestMethod.GET)
	public ModelAndView main(ModelAndView mv) {
		mv.setViewName("index");
		return mv;
	}
}
