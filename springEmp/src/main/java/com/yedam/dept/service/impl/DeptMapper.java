package com.yedam.dept.service.impl;

import java.util.List;

import com.yedam.dept.DeptVO;
import com.yedam.emp.EmpVO;

public interface DeptMapper {

	public int insertDept(DeptVO vo);

	public int updateDept(DeptVO vo);

	public int deleteDept(DeptVO vo);

	public DeptVO getDept(DeptVO vo);

	public List<DeptVO> getSearchDept(DeptVO vo);
}
