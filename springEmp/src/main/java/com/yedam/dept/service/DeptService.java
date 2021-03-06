package com.yedam.dept.service;

import java.util.List;

import com.yedam.dept.DeptVO;
import com.yedam.emp.EmpSearchVO;

public interface DeptService {

	public int insertDept(DeptVO vo);
	
	public int updateDept(DeptVO vo);
	
	public int deleteDept(DeptVO vo);

	public  DeptVO getDept(DeptVO vo);
	
	public List<DeptVO> getSearchDept(DeptVO vo);


	int getCount(DeptSearchVO vo);
	

}
