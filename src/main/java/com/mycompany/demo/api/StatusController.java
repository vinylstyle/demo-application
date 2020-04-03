package com.mycompany.demo.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("api/v1/status")
@RestController
public class StatusController {

	@GetMapping
	public String getStatus() {
		return "Server status is awesome!";
	}
}
