package com.docker.control;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DcoerController {
	
	
	@GetMapping("/")
	public String welcome() {
		return  "welcome to spring boot and docker appliction";
		
	}
	
	@GetMapping("/all")
	public String aboutUs() {
		return "this app working fine thanks for trusting us";
	}

}
