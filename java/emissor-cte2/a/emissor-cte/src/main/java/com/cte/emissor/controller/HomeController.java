package com.cte.emissor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	 @GetMapping("/")
	    public String home() {
	        return "index";  // Retorna a página 'index.html' se você estiver usando Thymeleaf ou outra engine de templates.
	    }
}
