package com.example.springonedemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
public class MyController {
	private final Logger logger = LoggerFactory.getLogger(getClass());

	@GetMapping("/hello/{name}")
	public MyDto sayHello(@PathVariable String name) {
		logger.info("sayHello('{}')", name);
		return new MyDto("Hello " + name + "!");
	}
}
