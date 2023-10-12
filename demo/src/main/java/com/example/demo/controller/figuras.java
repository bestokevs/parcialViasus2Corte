package com.example.demo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;

@Controller
public class figuras {

    @GetMapping("/figuras")
    public String showIndex(Model model) {
        model.addAttribute("title", "figuras");
        
        return "index";
    }
}