package com.project.burari.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.ModelAndView;

import com.project.burari.core.controller.BaseController;
import com.project.burari.core.service.IJwtService;
import com.project.burari.repository.ProjectRepository;
import com.project.burari.repository.UserRepository;
import com.project.burari.vo.ProjectVO;

@Controller
public class ProjectController extends BaseController{
	
	@Autowired
	ProjectRepository projectRepository;
	
	@Autowired
	UserRepository userRepository;
	
    @Autowired
    private IJwtService jwtService;

	@PostMapping("/api/project")
	public ModelAndView createProject(@RequestBody ProjectVO vo, HttpServletRequest request) throws Exception{
		vo.setUser(userRepository.findById((Integer)jwtService.getMemberId()));
		projectRepository.save(vo);
		
		return getReturnObject("");
	}
	
	@PostMapping("/api/projectlist")
	public ModelAndView Projectlist(@RequestBody ProjectVO vo, HttpServletRequest request) throws Exception{
		return getReturnObject(projectRepository.findByUser(userRepository.findById(jwtService.getMemberId())));
	}
}
