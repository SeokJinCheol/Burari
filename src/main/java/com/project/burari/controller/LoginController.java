package com.project.burari.controller;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.project.burari.core.controller.BaseController;
import com.project.burari.core.service.IJwtService;
import com.project.burari.repository.UserRepository;
import com.project.burari.vo.UserVO;

@Controller
public class LoginController extends BaseController {
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
    private IJwtService jwtService;
	
	@PostMapping(value="/Login")
	public ModelAndView Login(@RequestBody UserVO vo, HttpServletRequest request) throws Exception{
		String email = (String)vo.getEmail();
		
		String token = "";
		
		if(userRepository.findByEmail(email) != null) {
			token = jwtService.create("member", userRepository.findByEmail(email), "user");
		} else {
			userRepository.save(vo);
			token = jwtService.create("member", userRepository.findByEmail(email), "user");
		}
		
		
		HashMap<String, Object> ObjectData = new HashMap<>();
		
		ObjectData.put("token", token);
		ObjectData.put("userId", userRepository.findByEmail(email).getId());
		
		return getReturnObject(ObjectData);
	}
	
	
	@RequestMapping(value="/logincheck", method=RequestMethod.POST)
	public ModelAndView logincheck(HttpServletRequest request) throws Exception {
		System.out.println(request.getSession().getAttribute("userId"));
		return getReturnObject(null);
	}
}
