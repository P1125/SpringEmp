package com.yedam.emp.controller;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yedam.emp.EmpVO;
import com.yedam.emp.service.EmpService;

@Controller
public class EmpController {

	@Autowired EmpService empService;
	
	@RequestMapping("/")
	public String main() {
		return "main";
	}
	@GetMapping("/insertEmp") // Registration page
	public String insertEmp(EmpVO vo) {
		return "/emp/insertEmp";
	}
	@PostMapping("/insertEmp") // Registration process
	public String insertEmpProc(EmpVO vo) {
		empService.insertEmp(vo);
		return "redirect:/getSearchEmp";
	}	
	
	@GetMapping("/updateEmp") // Modify page
	public String updateEmp(EmpVO vo, Model model) {
		model.addAttribute("empVO", empService.getEmp(vo));
		return "/emp/updateEmp";
	}
	@PostMapping("/updateEmp") // Modify process
	public String updateEmpProc(EmpVO vo) {
		empService.updateEmp(vo);
		return "redirect:/getSearchEmp";
	}
	
	@GetMapping("/getEmp") // one look up
	public String getEmp(EmpVO vo, Model model) {
		model.addAttribute("emp", empService.getEmp(vo));
		return "/emp/getEmp";
	}
	@GetMapping("/getSearchEmp") //All Inquiry
	public String getSearchEmp(EmpVO vo, Model model) {
		model.addAttribute("list", empService.getSearchEmp(vo));
		return "/emp/getSearchEmp";
	}
	
	
	@RequestMapping("/deleteEmp") // delete
	public String deleteEmp(EmpVO vo, Model model) {
		empService.deleteEmp(vo);
		return "redircet:/getSearchEmp";
	}
	
}
