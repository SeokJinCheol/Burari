package com.project.burari.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.burari.vo.UserVO;

@Transactional
public interface UserRepository extends JpaRepository<UserVO, Long> {
	UserVO findById(Integer id);
	UserVO findByName(String name);
	UserVO findByEmail(String email);
	UserVO findByEmailAndPassword(String email, String password);
}
