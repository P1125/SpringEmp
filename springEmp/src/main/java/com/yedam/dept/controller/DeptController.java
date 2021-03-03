package com.yedam.dept.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yedam.dept.DeptVO;
import com.yedam.dept.service.DeptService;

@Controller
public class DeptController {
	@Autowired  DeptService deptService;
	
	@GetMapping("/insertDept")
	public String insertDept(DeptVO vo) {
		return "/dept/insertDept";
	}
	@PostMapping("/insertDept")
	public String insertDeptProc(DeptVO vo) {
		deptService.insertDept(vo);
		return "redirect:/getSearchDept";
	}
	
	@GetMapping("/updateDept")
	public String updateDept(DeptVO vo, Model model) {
		model.addAttribute("deptVO", deptService.getDept(vo));
		return "/dept/updateDept";
	}
	@PostMapping("/updateDept")
	public String updateDeptProc(DeptVO vo) {
		deptService.updateDept(vo);
		return "redirect:/getSearchDept";
	}
	
	@GetMapping("/getDept")
	public String getDept(DeptVO vo, Model model) {
		model.addAttribute("dept", deptService.getDept(vo));
		return "/dept/getDept";
	}
	@GetMapping("/getSearchDept")
	public String getSarchEmp(DeptVO vo, Model model) {
		model.addAttribute("list", deptService.getSearchDept(vo));
		return "/dept/getSearchDept";
	}
	
	
}
