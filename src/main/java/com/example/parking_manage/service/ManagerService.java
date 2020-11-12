package com.example.parking_manage.service;

import com.example.parking_manage.entity.Manager;
import com.example.parking_manage.repository.ManagerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManagerService {

    @Autowired
    private ManagerRepository managerRepository;

    public List<Manager> findAll(){
        return managerRepository.findAll();
    }

    public List<Manager> findByManager_name(String manage_name){
        return managerRepository.findByManager_name(manage_name);
    }

    /*
    * 插入三级管理员
    * 超级管理员只有一个，所以不需要去增加
    * */
    public Manager insert(Manager manager){
        return managerRepository.save(manager);
    }

    /*
    * 删除三级管理员
    * 超级管理员只有一个，所以不需要去删除
    * */
    public void delete(int manage_id){
        managerRepository.deleteById(manage_id);
    }
}
