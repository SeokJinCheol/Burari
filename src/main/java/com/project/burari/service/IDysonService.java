package com.project.burari.service;

import java.util.List;
import com.project.burari.vo.DysonVO;

public interface IDysonService {
	public void save(DysonVO vo);
	public List<DysonVO> select();
	public void update(DysonVO vo);
	public void delete(DysonVO vo);
}
