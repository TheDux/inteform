package com.inteform.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/localizacao")
    public String localizacao() {
        return "location";
    }

    @GetMapping("/contato")
    public String contato() {
        return "contact";
    }

    @GetMapping("/sobre")
    public String sobre() {
        return "about";
    }

}
