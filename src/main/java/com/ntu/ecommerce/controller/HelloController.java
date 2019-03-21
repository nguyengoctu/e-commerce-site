package com.ntu.ecommerce.controller;

import com.ntu.ecommerce.entity.Category;
import com.ntu.ecommerce.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
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

    @RequestMapping(value = {"/products"})
    public ModelAndView showProducts() {
        ModelAndView modelAndView = new ModelAndView("page");
        modelAndView.addObject("title", "Products");
        modelAndView.addObject("categories", categoryService.getAllCategories());
        modelAndView.addObject("userClickProducts", true);
        return modelAndView;
    }

    @RequestMapping(value = {"/category/{id}/products"})
    public ModelAndView showCategoryProducts(@PathVariable("id") int id) {
        ModelAndView modelAndView = new ModelAndView("page");
        Category category = categoryService.getCategory(id);
        modelAndView.addObject("title", category.getName());
        modelAndView.addObject("categories", categoryService.getAllCategories());
        modelAndView.addObject("category", categoryService.getCategory(id));
        modelAndView.addObject("userClickCategoryProducts", true);
        return modelAndView;
    }
}
