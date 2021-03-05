package com.yedam.dept.service;

import com.yedam.dept.DeptVO; 

import lombok.Data;

@Data
public class DeptSearchVO extends DeptVO {
	Integer page = 1;
	int start = 1;
	int end = 10;
}
