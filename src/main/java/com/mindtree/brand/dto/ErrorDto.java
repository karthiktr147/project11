package com.mindtree.brand.dto;

public class ErrorDto {

	String message;
	String errorType;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getErrorType() {
		return errorType;
	}
	public void setErrorType(String errorType) {
		this.errorType = errorType;
	}
	public ErrorDto(String message, String errorType) {
		super();
		this.message = message;
		this.errorType = errorType;
	}
	public ErrorDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
