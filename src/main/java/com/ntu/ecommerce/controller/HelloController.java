package com.ntu.ecommerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HelloController {

    @RequestMapping(value = {"/hello", "/", "/home"})
    public String hello() {
        return "homepage";
    }
}
