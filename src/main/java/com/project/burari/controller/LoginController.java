package com.project.burari.controller;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

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
public class LoginController extends BaseController {
	
	@Autowired
	UserRepository userRepository;
	private HttpSession session;
	
	@RequestMapping(value="/Login", method = RequestMethod.GET)
	public ModelAndView Login(@RequestParam HashMap<String, Object> userInfo, HttpServletRequest request) throws Exception{
		String email = (String)userInfo.get("email");
		session = request.getSession();
		session.setAttribute("userId", userRepository.findByEmail(email).getId());
		return getReturnObject(userRepository.findByEmail(email).getId());
	}
	
	
	@RequestMapping(value="/logincheck", method=RequestMethod.POST)
	public ModelAndView logincheck(HttpServletRequest request) throws Exception {
		System.out.println(request.getSession().getAttribute("userId"));
		return getReturnObject(null);
	}
}
