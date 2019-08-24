package com.project.burari.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.burari.vo.DysonVO;

public interface DysonRepository extends JpaRepository<DysonVO, Long> {
	DysonVO findById(Integer id);
	DysonVO findByTitle(String title);
}
