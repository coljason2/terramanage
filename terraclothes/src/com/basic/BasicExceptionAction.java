package com.basic;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class BasicExceptionAction {
	@ExceptionHandler(RuntimeException.class)
	@ResponseBody
	@ResponseStatus(value = HttpStatus.NOT_FOUND)
	public String error() {
		System.out.println("----------------------------------");
		return "error";
	}

	@ExceptionHandler(RuntimeException.class)
	@ResponseBody
	@ResponseStatus(value = HttpStatus.BAD_REQUEST)
	public String handleCustomException() {
		System.out.println("----------------------------------");
		return "error";
	}
}
