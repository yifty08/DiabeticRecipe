package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String homePage() {
        return "index";
    }

    @RequestMapping("/recipe1")
    public String recipe1() {
        return "recipe1";
    }

    @RequestMapping("/recipe2")
    public String recipe2() {
        return "recipe2";
    }

    @RequestMapping("/recipe3")
    public String recipe3() {
        return "recipe3";
    }

    @RequestMapping("/recipe4")
    public String recipe4() {
        return "recipe4";
    }

    @RequestMapping("/recipe5")
    public String recipe5() {
        return "recipe5";
    }

}
