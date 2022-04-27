package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
// 自动扫描当前的类，将其作为spring的一个并级管理，允许这个类接收前端请求
public class helloController {
    @GetMapping("/hello")
    public String hello(@RequestParam(name = "name") String name, Model model) {
        model.addAttribute("name", name);  // 将浏览器中传入的值传入model中
        return "hello";  //自动去寻找hello模板
    }
}
