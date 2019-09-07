package com.project.burari.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
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

	@PostMapping("/project")
	public ModelAndView createProject(@RequestBody ProjectVO vo, HttpServletRequest request) throws Exception{		
		vo.setUser(userRepository.findById((Integer)request.getSession().getAttribute("userId")));
		projectRepository.save(vo);
		
		return getReturnObject("");
	}
	
	@PostMapping("/projectlist")
	public ModelAndView Projectlist(@RequestBody ProjectVO vo, HttpServletRequest request) throws Exception{
		return getReturnObject(projectRepository.findByUser(userRepository.findById((Integer)request.getSession().getAttribute("userId"))));
	}
}
