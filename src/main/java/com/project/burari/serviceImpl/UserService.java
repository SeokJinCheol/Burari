package com.project.burari.serviceImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.burari.repository.JpaCRUDRepository;
import com.project.burari.service.IUserService;
import com.project.burari.vo.UserVO;

@Service("UserService")
@Transactional
public class UserService implements IUserService{
	
	@Autowired
	JpaCRUDRepository<UserVO> CRUDrepository;

	@Override
	public void save(UserVO vo) {
		CRUDrepository.save(vo);		
	}

	@Override
	public List<UserVO> select() {
		String sql = "";
		return CRUDrepository.findAll(sql);
	}

	@Override
	public void update(UserVO vo) {
		CRUDrepository.update(vo);
	}

	@Override
	public void delete(UserVO vo) {
		CRUDrepository.delete(vo);
	}

}
