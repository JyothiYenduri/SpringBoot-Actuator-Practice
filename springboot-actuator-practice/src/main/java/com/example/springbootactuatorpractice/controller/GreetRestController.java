package com.example.springbootactuatorpractice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetRestController {

	@GetMapping("/greet")
	public String greetMsg() {
		return "Good Evening..!";
	}
}
