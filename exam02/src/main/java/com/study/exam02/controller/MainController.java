package com.study.exam02.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/hello")
    public String hello()
    {
        System.out.println("Receive Hello Get Request");
        return "hello";
    }

    @GetMapping("/login")
    public String login()
    {
        System.out.println("LOGIN SUCCESS");
        return "login";
    }

}
