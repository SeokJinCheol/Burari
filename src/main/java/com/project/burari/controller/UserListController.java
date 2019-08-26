package com.project.burari.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.project.burari.core.controller.BaseController;
import com.project.burari.repository.UserRepository;

@Controller
@CrossOrigin
public class UserListController extends BaseController {
	
	@Autowired
	UserRepository UserRepository;
	
	@RequestMapping(value="/findUser", method=RequestMethod.GET)
	public ModelAndView userlist(@RequestParam HashMap<String, Object> aa) throws Exception{
		
		System.out.println(aa);
		System.out.println(aa.get("id"));
		System.out.println(aa.get("email"));
		
		System.out.println(UserRepository.findAll());
		System.out.println(UserRepository.findByName((String) aa.get("name")));
		System.out.println(UserRepository.findById((Integer) aa.get("id")));
		System.out.println(UserRepository.findByEmail("tjrwlscjf13@gmail.com"));
		
		return getReturnObject(null);
	}
}
