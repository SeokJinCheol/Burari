package com.project.burari.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.project.burari.service.IUserService;
import com.project.burari.util.BaseController;
import com.project.burari.vo.UserVO;

@Controller
public class LoginController extends BaseController {
	
	@Autowired
	IUserService IUserServiceImpl;
	
	@RequestMapping(value="/Login", method = RequestMethod.POST)
	public ModelAndView Login(UserVO vo) throws Exception{
		return getReturnObject(IUserServiceImpl.select());
	}
}
