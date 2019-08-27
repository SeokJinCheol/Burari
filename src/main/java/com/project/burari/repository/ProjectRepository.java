package com.project.burari.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.burari.vo.ProjectVO;

@Transactional
public interface ProjectRepository extends JpaRepository<ProjectVO, Long>{

}
