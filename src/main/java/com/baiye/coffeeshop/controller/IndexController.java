package com.baiye.coffeeshop.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @RequestMapping("/welcome")
    public String welcome(){
        return "welcome";
    }
}
