package com.bookapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

	@GetMapping("/hi")
	public String sayHi() {
		return "Testing API successful";
	}
}
