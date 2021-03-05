package com.yedam.board;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Data
public class CommentsVO {
	private String id; // int(9), long(13)    BigDecimal / oracle(38)
	private String name;
	private String content;
	private String board_id;
	private String out_msg;
	private String[] ids; // @JsonIgnore
	@JsonFormat(pattern = "yyyy/MM/dd HH:mm")
	private Date wdate;

}
