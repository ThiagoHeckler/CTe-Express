package com.thiago.cteemisor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ErrorController implements org.springframework.boot.web.servlet.error.ErrorController {
	 @RequestMapping("/error")
	    public String handleError() {
	        // Retorne uma página de erro específica, como "errorPage"
	        return "errorPage";  // Certifique-se de que este nome corresponda a um arquivo real
	    }
}
