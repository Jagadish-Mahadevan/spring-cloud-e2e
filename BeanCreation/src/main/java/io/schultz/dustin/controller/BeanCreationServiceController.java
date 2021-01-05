package io.schultz.dustin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.schultz.dustin.service.DemoService;

@RestController
public class BeanCreationServiceController {

	@Autowired
	private DemoService demoService;

	@RequestMapping("/launch")
	public String handleRequest() {
		
		System.out.println(demoService);
		return "Bean creation demo";
	}
}
