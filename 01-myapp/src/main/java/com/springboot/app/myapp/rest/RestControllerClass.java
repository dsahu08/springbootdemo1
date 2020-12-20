package com.springboot.app.myapp.rest;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerClass {

	@GetMapping("/")
	public String sayHello() {
		return "Hello World! Time on server is "+ LocalDateTime.now();
	}
}
