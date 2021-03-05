package com.yedam.board.controller;

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

import com.yedam.board.CommentsVO;
import com.yedam.board.service.CommentsService;

@RestController
public class CommentsController {

	@Autowired
	CommentsService commentsService;
	// Enrollment

	// Registration processing
	@PostMapping("/Comments")
	public CommentsVO insertCommentsProc(@RequestBody CommentsVO vo) {
		commentsService.insertComments(vo);
		if (vo.getId().equals("0")) {
			return vo;
		} else {
			return commentsService.getComments(vo);
		}
	}
	//update 
	@PutMapping("/Comments")
	public CommentsVO updateCommentsProc(@RequestBody CommentsVO vo) {
		System.out.println("수정=====" + vo);
		return vo;
	}


	// delete
	@DeleteMapping(value = "/Comments")
			//		method = RequestMethod.DELETE)
	public Map deleteComments(@RequestBody CommentsVO vo) {
		int r = commentsService.deleteComments(vo);
		return Collections.singletonMap("cnt", r);
	}
	

	// View comments
	@GetMapping("/Comments")
	public List<CommentsVO> getSearchComments(@RequestBody CommentsVO vo) {

		return commentsService.getSearchComments(vo);

	}

	// Single inquiry
	@GetMapping("/Comments/{id}")
	public CommentsVO gethComments(CommentsVO vo,
									@PathVariable String id) {
		vo.setId(id);
		return commentsService.getComments(vo);
	}

}
