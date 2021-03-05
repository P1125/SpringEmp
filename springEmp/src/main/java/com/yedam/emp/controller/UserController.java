package com.yedam.emp.controller;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.yedam.emp.UserVO;
import com.yedam.emp.service.UserService;

@RestController
public class UserController {
	
	@Autowired UserService userService;
	
	
	@PostMapping("/User")
	public UserVO insertUserProc(@RequestBody UserVO vo) {
		userService.insertUser(vo);
		return vo;
	}

	@PutMapping("/User")
	public UserVO updateUser(@RequestBody UserVO vo) {
		return vo;
	}

	@DeleteMapping(value = "/User")
	public Map deleteUser(@RequestBody UserVO vo) {
		int r = userService.deleteUser(vo);
		return Collections.singletonMap("cnt", r);
	}
	
	@GetMapping("/User")
	public List<UserVO> getSearchUser(UserVO vo){
		return userService.getSearchUser(vo);
	}
	
	@GetMapping("/User/{id}")
	public UserVO getUser(UserVO vo,
							@PathVariable String id) {
		vo.setId(id);
		return userService.getUser(vo);
	}
	
	
}
