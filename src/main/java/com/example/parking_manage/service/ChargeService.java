package com.example.parking_manage.service;
import com.example.parking_manage.entity.Charge;
import com.example.parking_manage.repository.ChargeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName: ChargeService
 * @Author: ChenXu
 * @Date: 2020/12/2 11:16
 * @Description: ToDo
 */
@Service
public class ChargeService {
    @Autowired
    private ChargeRepository chargeRepository;

    public List<Charge> findAll(){
        return chargeRepository.findAll();
    }
}
