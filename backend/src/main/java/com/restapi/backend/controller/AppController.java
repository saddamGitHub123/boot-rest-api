/**
 * 
 */
package com.restapi.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Sk Saddam Hosan
 */
@RestController
@RequestMapping("/app")
public class AppController {
	
	
	@GetMapping("/welcome")
	public String appWelCome() {
		
		return "WelCome to Spring Boot project";
	}

}
