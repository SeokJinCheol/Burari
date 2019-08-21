package com.project.burari.service;

import java.util.List;

import com.project.burari.vo.UserVO;

public interface IUserService {
	public void save(UserVO vo);
	public List<UserVO> select();
	public void update(UserVO vo);
	public void delete(UserVO vo);
}
