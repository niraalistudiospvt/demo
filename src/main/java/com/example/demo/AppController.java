package com.example.demo;

 

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping
public class AppController {

	@GetMapping("/getm")
	public String getData() {
		return "welcome to rest API";
	}
	

	@GetMapping("/getm1")
	public String getData1() {
		System.out.println("welcome to getm 1 method");
		return "welcome to rest API";
	}

	@GetMapping("/getm2")
	public String getData2() {
		System.out.println("welcome to getm 1 method");
		return "welcome to rest API";
	}

	@GetMapping("/getm3")
	
	public String getData3() {
		try {
			System.out.println("welcome to getm 1 method");
			return "welcome to rest API";
		}catch(Exception e) {
			
		}
		return null;
	}


	private void alert(String string) {
		// TODO Auto-generated method stub
		
	}

}
