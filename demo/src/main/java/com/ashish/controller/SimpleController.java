package com.ashish.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

	//url- http://localhost:9091/hello
	@RequestMapping("/hello")
	public String hello() {
		System.out.println("hello controller is working");
		return "hello spring-boot";
	} 
}
