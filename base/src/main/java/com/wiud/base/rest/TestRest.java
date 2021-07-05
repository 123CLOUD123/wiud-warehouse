package com.wiud.base.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/base")
public class TestRest {

	@Value("${test}")
	private String test;
	
	@GetMapping("/test")
	public String test() {
		return "hello base123" + test;
	}
	
	@GetMapping("/test2")
	public String test2() {
		return "hello test22222222";
	}
	
}
