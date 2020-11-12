package com.example.parking_manage.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {

    private String myname;
    private Integer id;

    @RequestMapping("/test")
    public String testData(){
        id = 2;
        myname = "张三";
        return "name" + myname + "id" + id;
    }
}
