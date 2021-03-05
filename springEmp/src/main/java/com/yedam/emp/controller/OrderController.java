package com.yedam.emp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.yedam.emp.OrderMasterVO;

@Controller
public class OrderController {
	 // Mapping should be put /
	@GetMapping("/insertOrder") //Where to go to the order form
	public String insertOdrer(OrderMasterVO vo) {
		System.out.println(vo);
		return "order/insertOrder";
	}
	
	
	@PostMapping("/insertOrder")// Order processing
	public String insertOdrerProc(OrderMasterVO vo) {
		System.out.println(vo);
		//master table Enrollment
		
		//Order details ,  Register as many as the number of lists
		
		return "redirect:/";

	
	
	}
	
}
