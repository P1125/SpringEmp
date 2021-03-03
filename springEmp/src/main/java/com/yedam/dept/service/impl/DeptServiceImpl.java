package com.yedam.dept.service.impl;

import java.util.List; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yedam.dept.DeptVO;
import com.yedam.dept.service.DeptService;

@Service
public class DeptServiceImpl implements DeptService{
	//@Autowired DeptSpringDAO dao;
	@Autowired DeptMapper dao;
	
	public int insertDept(DeptVO vo) {
		return dao.insertDept(vo);
	}

	public int updateDept(DeptVO vo) {
		return dao.updateDept(vo);
	}

	public int deleteDept(DeptVO vo) {
		return dao.deleteDept(vo);
	}

	public DeptVO getDept(DeptVO vo) {
		return dao.getDept(vo);
	}

	public List<DeptVO> getSearchDept(DeptVO vo) {
		return dao.getSearchDept(vo);
	}
	
}