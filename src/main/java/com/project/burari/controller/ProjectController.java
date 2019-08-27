package com.project.burari.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.project.burari.core.controller.BaseController;
import com.project.burari.repository.ProjectRepository;
import com.project.burari.repository.UserRepository;
import com.project.burari.vo.ProjectVO;

@Controller
public class ProjectController extends BaseController{
	
	@Autowired
	ProjectRepository projectRepository;
	
	@Autowired
	UserRepository userRepository;

	@RequestMapping(value="/project", method=RequestMethod.POST)
	public ModelAndView createProject(@RequestBody ProjectVO vo) throws Exception{
		System.out.println(vo);
		vo.setUser(userRepository.findById(5));
		projectRepository.save(vo);
		
		
		
		return getReturnObject("");
	}
}
