package com.ntu.ecommerce.controller;

import com.ntu.ecommerce.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class HelloController {
    @Autowired
    private CategoryService categoryService;

    @RequestMapping(value = {"/hello", "/", "/home", "/index"})
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView("page");
        modelAndView.addObject("title", "Home");
        modelAndView.addObject("userClickHome", true);
        modelAndView.addObject("categories", categoryService.getAllCategories());
        return modelAndView;
    }

    @RequestMapping(value = {"/about"})
    public ModelAndView about() {
        ModelAndView modelAndView = new ModelAndView("page");
        modelAndView.addObject("title", "About us");
        modelAndView.addObject("userClickAbout", true);
        return modelAndView;
    }

    @RequestMapping(value = {"/contact"})
    public ModelAndView contact() {
        ModelAndView modelAndView = new ModelAndView("page");
        modelAndView.addObject("title", "Contact us");
        modelAndView.addObject("userClickContact", true);
        return modelAndView;
    }
}
