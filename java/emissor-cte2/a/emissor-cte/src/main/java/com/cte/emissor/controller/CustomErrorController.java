package com.cte.emissor.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomErrorController implements ErrorController {

    @RequestMapping("/error")
    public String handleError() {
        // Retorna o nome da página de erro personalizada
        return "error";
    }

    public String getErrorPath() {
        return "/error";
    }
}

