package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


    @RequestMapping("/hh")
    public String hello(){
        return "李明涛就是一个大傻逼";
    }
}
