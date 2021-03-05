package com.yedam.emp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yedam.dept.service.DeptSearchVO;
import com.yedam.dept.service.DeptService;
import com.yedam.emp.EmpSearchVO;
import com.yedam.emp.EmpVO;
import com.yedam.emp.JobVO;
import com.yedam.emp.common.Paging;
import com.yedam.emp.service.EmpService;

@Controller
public class EmpController {
	@Autowired EmpService empService;
	@Autowired DeptService deptService;
//	@Autowired JobService jobService;
	
	
	@RequestMapping("/")
	public String main() {
		return "main";
	}
	@GetMapping("/insertEmp") // Registration page
	public String insertEmp(EmpVO vo, Model model, DeptSearchVO deptvo,JobVO jobvo) {
	//	deptvo.setStart(1);
	//	deptvo.setEnd(1000);
	//	model.addAttribute("deptList", jobService.getSearchDept(jobvo));
		model.addAttribute("deptList", deptService.getSearchDept(deptvo));
		return "/emp/insertEmp";
	}
	@PostMapping("/insertEmp") // Registration process
	public String insertEmpProc(EmpVO vo) {
		empService.insertEmp(vo);
		return "redirect:/getSearchEmp";
	}	
	
	@GetMapping("/updateEmp") // Modify page
	public String updateEmp(EmpVO vo, Model model, DeptSearchVO deptvo,JobVO jobvo) {
		model.addAttribute("empVO", empService.getEmp(vo));
		model.addAttribute("deptList", deptService.getSearchDept(deptvo));
		return "/emp/updateEmp";
	}
	@PostMapping("/updateEmp") // Modify process
	public String updateEmpProc(EmpVO vo) {
		empService.updateEmp(vo);
		return "redirect:/getSearchEmp";
	}
	
	@GetMapping("/getEmp") // Single inquiry  /getEmp/{employee_id} { } Variable name
	public String getEmp(Model model
						  //, HttpServletRequest request //2. Method using param
//						 	,@RequestParam(value="id",
//						 				   required = false, 
//						 				   defaultValue="100" ) String employee_id
						//, @PathVariable String employee_id // 3
						,@ModelAttribute("employee") EmpVO vo // Be Simple, Just put it in the command object.
						//When stored in the model, put it as employee
						) {
		//1.getParamter / The original way
//		String employee_id = request.getParameter("employee_id");
		//EmpVO vo = new EmpVO();
		//vo.setEmployee_id(employee_id); 3
		
		model.addAttribute("emp", empService.getEmp(vo));
		return "/emp/getEmp";
	}
	@GetMapping("/getSearchEmp") //All Inquiry
	public String getSearchEmp(EmpSearchVO vo,Paging paging ,Model model) {
		paging.setPageUnit(5);// Number of records displayed on one page
		paging.setPageSize(3);// Page number
		//paging
		if(vo.getPage() == null) {
			vo.setPage(1);
		}
		vo.setStart(paging.getFirst());
		vo.setEnd(paging.getLast());
		paging.setTotalRecord(100);
		model.addAttribute("paging", paging);
		model.addAttribute("list", empService.getSearchEmp(vo));
		return "/emp/getSearchEmp";
	//	int start = (vo.getPage() - 1 ) * 10 + 1;
	//	int end = start + 10 - 1; // One page output unit
	//	vo.setStart(start);
	//	vo.setEnd(end);
	}
	
	
	@RequestMapping("/deleteEmp") // delete
	public String deleteEmp(EmpVO vo, Model model) {
		empService.deleteEmp(vo);
		return "redircet:/getSearchEmp";
	}
	
}
