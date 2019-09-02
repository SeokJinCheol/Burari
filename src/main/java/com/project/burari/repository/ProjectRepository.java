package com.project.burari.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.burari.vo.ProjectVO;
import com.project.burari.vo.UserVO;

@Transactional
public interface ProjectRepository extends JpaRepository<ProjectVO, Long>{
	List<ProjectVO> findByUser(UserVO user);
}
