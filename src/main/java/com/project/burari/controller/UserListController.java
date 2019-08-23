package com.project.burari.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.project.burari.repository.UserRepository;
import com.project.burari.util.BaseController;

@Controller
public class UserListController extends BaseController {
	
	@Autowired
	UserRepository UserRepository;
	
	@RequestMapping(value="/findUser", method=RequestMethod.GET)
	public ModelAndView userlist() throws Exception{
		
		System.out.println(UserRepository.findAll());
		System.out.println(UserRepository.findById(1));
		System.out.println(UserRepository.findByName("손다연"));
		
		return getReturnObject(null);
	}
}
