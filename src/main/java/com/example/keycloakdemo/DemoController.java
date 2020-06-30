package com.example.keycloakdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

@Controller
public class DemoController {
	@GetMapping("/")
	public String index() {
		return "external";
	}

	@GetMapping("/customers")
	public String customers(Principal principal, Model model) {
		Customer[] customerList = new Customer[]{
				new Customer("1", "Acme Inc", "123 Short Street", "Cleaning"),
				new Customer("2", "IBM", "456 Long Avenue", "Garbage Collection")
		};
		model.addAttribute("customers", customerList);
		model.addAttribute("username", principal.getName());
		return "customers";
	}
}
