package com.project.burari.controller;

import java.net.InetAddress;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class MainController {
	
	@GetMapping(value="/")
	public ModelAndView main(ModelAndView mv) throws Exception {
		
		InetAddress local = InetAddress.getLocalHost();
		String ip = local.getHostAddress();
        
        mv.setViewName("index");
        mv.addObject("clientIP", ip);
		
		System.out.println(ip);
		return mv;
	}
}
