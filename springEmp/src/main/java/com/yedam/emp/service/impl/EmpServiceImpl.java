package com.yedam.emp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yedam.emp.EmpVO;
import com.yedam.emp.service.EmpService;

@Service
public class EmpServiceImpl implements EmpService {
	@Autowired EmpSpringDAO dao;
	
	public int insertEmp(EmpVO vo) {
		return 0;
	}

	public int updateEmp(EmpVO vo) {
		return 0;
	}

	public int deleteEmp(EmpVO vo) {
		return 0;
	}

	public EmpVO getEmp(EmpVO vo) {
		return null;
	}

	public List<EmpVO> getSearchEmp(EmpVO vo) {
		return dao.getSearchEmp(vo);
	}

}
