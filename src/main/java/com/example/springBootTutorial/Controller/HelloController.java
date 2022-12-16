package com.example.springBootTutorial.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/get")
	public String HelloWorld() {
		return "this is first controller";
		
	}

}
