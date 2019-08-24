package com.project.burari.serviceImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.burari.repository.JpaCRUDRepository;
import com.project.burari.service.IDysonService;
import com.project.burari.vo.DysonVO;

@Service("DysonService")
@Transactional
public class DysonService implements IDysonService{
	
	@Autowired
	JpaCRUDRepository<DysonVO> CRUDrepository;

	@Override
	public void save(DysonVO vo) {
		CRUDrepository.save(vo);		
	}

	@Override
	public List<DysonVO> select() {
		String sql = "";
		return CRUDrepository.findAll(sql);
	}

	@Override
	public void update(DysonVO vo) {
		CRUDrepository.update(vo);
	}

	@Override
	public void delete(DysonVO vo) {
		CRUDrepository.delete(vo);
	}

}
