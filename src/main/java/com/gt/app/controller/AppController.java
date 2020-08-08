package com.gt.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class AppController {

    @RequestMapping("/hello")
    @ResponseBody
    public String Hell0(){
        return "HEllO WORLD";
    }
}
