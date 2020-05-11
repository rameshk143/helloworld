package com.techinfo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Ramesh.K
 *
 */
@RestController
@RequestMapping("/api")
public class HelloController {

	/**
	 * @author Ramesh.K
	 * @description Api to get hello world message
	 * @return String
	 */
	@GetMapping("/hello")
	public String hello() {
		return "Hello World !!!";
	}
}
