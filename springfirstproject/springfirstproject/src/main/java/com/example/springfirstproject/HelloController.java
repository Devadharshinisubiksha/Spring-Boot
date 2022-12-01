package com.example.springfirstproject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloController {
	
	//@GetMapping("/")
	//public String hello() {
		//return "my first spring program ";
	@GetMapping("/Hello")
	public String sayHello(@RequestParam(value = "myName",defaultValue="World")String name) {
	return String.format("Hello %s!",name);
	}

	}