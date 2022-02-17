package com.example.demo.hello;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="http://localhost:4200/")
public class HelloWorldController {

	@RequestMapping(method=RequestMethod.GET,path="/hello-world")
	public String hello() {
		
		return "Hello World";

	}
	
	@GetMapping(path="/hi-world")
	public String world() {
		
		return "Hi World";

	}
	
	@GetMapping(path="/hello-world-bean")
	public HelloWorldBean helloWorld() {
		
		return new HelloWorldBean("Hi World");

	}
	
	@GetMapping(path="/hello-world-bean/path-variable/{name}")
	public HelloWorldBean helloWorld(@PathVariable String name) {
		
		//throw new RuntimeException("Something went wrong");
		
		return new HelloWorldBean(String.format("Hi World %s",name));

	}
	
	
}
