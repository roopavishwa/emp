package com.learn.vishwa.dto;

import java.util.List;

import com.learn.vishwa.entity.EmpEntity;

public class ResponseDto {


	private String response;
	private Long code;
	
	public ResponseDto(Long insert201ErrorCode, String response) {
		super();
		this.response = response;
		this.code = insert201ErrorCode;
	}



	public String getResponse() {
		return response;
	}
	public void setResponse(String response) {
		this.response = response;
	}
	public Long getCode() {
		return code;
	}
	public void setCode(Long code) {
		this.code = code;
	}

	
	
}