package com.project.burari.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.project.burari.core.controller.BaseController;
import com.project.burari.service.IUserService;
import com.project.burari.vo.UserVO;

@Controller
@CrossOrigin
public class SignUpController extends BaseController{
	
	@Autowired
	IUserService userServiceImpl;
	
	@RequestMapping(value="/signup", method = RequestMethod.POST)
	public ModelAndView signup(@RequestBody UserVO vo) throws Exception {
		userServiceImpl.save(vo);
		return getReturnObject(null);
	}
}
