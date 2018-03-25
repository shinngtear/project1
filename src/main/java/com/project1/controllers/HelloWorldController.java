package com.project1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

	@RequestMapping(value="/")
	public String welcome() {
		return "welcome";
	}
}
