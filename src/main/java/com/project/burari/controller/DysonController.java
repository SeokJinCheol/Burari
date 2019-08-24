package com.project.burari.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.project.burari.repository.DysonRepository;
import com.project.burari.util.BaseController;
import com.project.burari.vo.DysonVO;

@Controller
public class DysonController extends BaseController {
	
	@Autowired
	DysonRepository dysonRepository;
	
	@RequestMapping(value="/DysonView", method = RequestMethod.GET)
	public ModelAndView DysonView(@RequestBody DysonVO vo) throws Exception{
		return getReturnObject(dysonRepository.findAll());
	}
	
	@RequestMapping(value="/DysonWrite", method = RequestMethod.POST)
	public ModelAndView DysonWrite(@RequestBody DysonVO vo) throws Exception {
		dysonRepository.save(vo);
		return getReturnObject(null);
	}
}
