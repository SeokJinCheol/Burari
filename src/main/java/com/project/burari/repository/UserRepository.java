package com.project.burari.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.burari.vo.UserVO;

public interface UserRepository extends JpaRepository<UserVO, Long> {
	UserVO findById(Integer id);
}
