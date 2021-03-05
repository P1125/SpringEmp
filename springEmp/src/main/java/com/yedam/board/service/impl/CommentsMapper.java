package com.yedam.board.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.yedam.board.CommentsVO;

@Repository
public interface CommentsMapper {
	

	public int insertComments(CommentsVO vo);
	
	public int deleteComments(CommentsVO vo);
	
	public int updateComments(CommentsVO vo);
	
	public CommentsVO getComments(CommentsVO vo);
	
	public List<CommentsVO> getSearchComments(CommentsVO vo);
	
	
	
}
