package com.example.parking_manage.controller;

import com.example.parking_manage.entity.Charge;
import com.example.parking_manage.service.ChargeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName: ChargeController
 * @Author: ChenXu
 * @Date: 2020/12/2 11:16
 * @Description: ToDo
 */
@RestController
@RequestMapping("/charge")
public class ChargeController {

    @Autowired
    private ChargeService chargeService;

    @RequestMapping("/findAll")
    public List<Charge> findAll(){
        return chargeService.findAll();
    }

}
