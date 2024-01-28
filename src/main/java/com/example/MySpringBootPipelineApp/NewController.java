package com.example.MySpringBootPipelineApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/news")
public class NewController {

	
	@GetMapping("/headline")
	public String getHeadline() {
		return "Simplilearn Pipeling Tutorial";
	}
	
	
}
