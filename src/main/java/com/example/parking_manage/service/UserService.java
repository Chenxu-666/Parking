package com.example.parking_manage.service;

import com.example.parking_manage.repository.UserRepository;
import com.example.parking_manage.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userDao;

    //所有用户
    public List<User> findAll() {
        return userDao.findAll();
    }

    //插入 and 更新
    public User insert(User u){
        return userDao.save(u);
    }

    //通过邮箱查找用户
    public List<User> findByEmail(String email){
        return userDao.findByEmail(email);
    }

    //通过用户名查找用户
    public List<User> findByUser_name(String name){
        return userDao.findByUser_name(name);
    }


    //判断是否存在邮箱
    public boolean isHasEmail(String mail){
        List<User> u=userDao.findByEmail(mail);
        if(u.size() == 0){
            return false;
        }
        else{
            return true;
        }
    }

    //判断是否存在用户名
    public boolean isHasUser_name(String name){
        List<User> u=userDao.findByUser_name(name);
        if(u.size() == 0){
            return false;
        }
        else{
            return true;
        }
    }





}
