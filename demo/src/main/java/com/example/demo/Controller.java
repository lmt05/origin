package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @RequestMapping("hello")
    public String test(String arg) {
        System.out.println("第一次提交成功");
        return "hello," + arg;
    }
}
