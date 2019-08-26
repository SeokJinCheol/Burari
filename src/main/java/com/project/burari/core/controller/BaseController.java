package com.project.burari.core.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.servlet.ModelAndView;

public class BaseController {
	
	public ModelAndView returnobject(Object data, int flag, String expression) throws Exception {
		Map<String, Object> message = new HashMap<String, Object>();
		ModelAndView mv = new ModelAndView();
		
		mv.addObject("Data", data);
		
		message.put("Flag", flag);
		message.put("Expression", expression);
		
		mv.addObject("message", message);
		mv.addObject("success", true);
		mv.setViewName("jsonView");
		
		return mv;
	}
	
	
	public ModelAndView getReturnObject(Object data) throws Exception {
		return returnobject(data, 0, "");
	}
	
	public ModelAndView getReturnObjectWithMessage(Object data, int flag, String message) throws Exception {
		return returnobject(data, flag, message);
	}
}
