package com.example.parking_manage.controller;

import com.example.parking_manage.entity.User;
import com.example.parking_manage.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    //测试
    @RequestMapping("/test")
    public String test() {
        return "对不起，但请你不要伤害我！";
    }

    @RequestMapping("/findAll")
    @ResponseBody
    public List<User> findAll() {
        List<User> u = userService.findAll();
        System.out.println(u);
        return userService.findAll();
    }

    //插入新用户  注册
    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public String insert(HttpServletRequest request){
        //获取前端数据
        String user_name=request.getParameter("user_name");
        String password=request.getParameter("password");
        System.out.println(user_name+password);
        //创建用户
        User u=new User(0,user_name,"男",0,null,null,null,null,password,null,null,null,null,null,0.0,null);
        //控制台输出用户详细数据，用于查看与记录
        System.out.print("详细：");
        System.out.println(u.toString());
        //插入
        userService.insert(u);
        return "插入成功";
    }

    //登录
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(HttpServletRequest request){
        String user_name=request.getParameter("user_name");
        String password=request.getParameter("password");
        System.out.println(user_name + " " + password);
        List<User> u=userService.findByUser_name(user_name);
        if (user_name != null&& password != null) {
            String pass=u.get(0).getAccount_password();
            System.out.print("详细：");
            System.out.println("用户名为："+user_name+"登录");
            //判断密码是否正确
            if(pass.equals(password)){
                return "登录成功";
            }else{
                return "密码错误";
            }

        }else {
            return "接收数据出错";
        }


    }


}

