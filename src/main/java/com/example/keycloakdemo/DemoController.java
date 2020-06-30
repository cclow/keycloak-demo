package com.example.keycloakdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {
	@GetMapping("/")
	public String index() {
		return "external";
	}

	@GetMapping("/customers")
	public String customers(Model model) {
		return "customers";
	}
}
