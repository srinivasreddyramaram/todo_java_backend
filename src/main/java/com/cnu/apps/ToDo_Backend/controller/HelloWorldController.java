package com.cnu.apps.ToDo_Backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cnu.apps.ToDo_Backend.model.HelloWorld;

@RestController
public class HelloWorldController {

	@GetMapping(path = "/hello-world")
	public String helloWorld( ) {
		return "Hello World";
	}
	
	@GetMapping(path = "/hello-world/{name}")
	public HelloWorld helloWorldName(@PathVariable ("name") String name) {
		return new HelloWorld(String.format("Hello World, %s", name));
	}
}
