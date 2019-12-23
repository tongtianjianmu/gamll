package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Li
 * @Date: 2019/12/23 14:54
 */
@RestController
public class TestController {

    @RequestMapping("/getTest")
    public String doString(){
        return "Hello World !!! ";
    }
}
