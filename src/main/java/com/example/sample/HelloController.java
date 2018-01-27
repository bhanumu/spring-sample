package com.example.sample;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String hello(@RequestParam(required = false) String name) {
		if(name != null) {			
			return "Hello " + name + "!";
		}
		return "Hello World!";
	}
	
}
