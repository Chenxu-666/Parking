package com.example.parking_manage.controller;

/**
 * @author ChenXu
 * @Date 2020-11-03
 */

import com.example.parking_manage.entity.Manager;
import com.example.parking_manage.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
@RequestMapping("/manager")
public class ManagerController {

    @Autowired
    private ManagerService managerService;

    /*
    * 实现登录功能
    * 有三级用户:
    * 超级管理员root
    * 经理manager
    * 保安simple
    * */
    @PostMapping("/login")
    public String login(HttpServletRequest request,
                        HttpSession session){
        String manager_name = request.getParameter("manage_name");
        String manager_password = request.getParameter("manage_password");
        String identity = request.getParameter("identity");
        List<Manager> manager = managerService.findByManager_name(manager_name);
        if (manager.get(0).getManage_password().equals(manager_password) &&
                identity=="root"){
            return "success";
        }else if (manager.get(0).getManage_password().equals(manager_password) &&
                  identity == "manager"){
            return "管理员ID： "+manager.get(0).getManage_id() + "success";
        }else if (manager.get(0).getManage_password().equals(manager_password) &&
                  identity == "simple"){
            return "保安所属经理的ID: "+manager.get(0).getParent_id() + "success";
        }else
            return "用户名或密码错误!";
    }
    /*
    * 实现注册功能
    * 三级用户: 超级管理员root 区域经理manager 保安simple
    * 加到一个接口里
    * 超级管理员只有一个不需要再去增加
    * */
    @PostMapping("/add")
    public String insert(HttpServletRequest request){
        //获取前端传来的参数
        String manager_name = request.getParameter("manager_name");
        String manager_password = request.getParameter("manager_password");
        String identity = request.getParameter("identity");
        String id = request.getParameter("manage_id");
        if (identity.equals("root")){
            Manager manager = new Manager(0,0,manager_name,manager_password,"manager",null);
            managerService.insert(manager);
            return "插入成功";
        }else if (identity.equals("manager")){
            //创建新的对象
            Manager manager = new Manager(0, Integer.parseInt(id),manager_name,manager_password,"simple",null);
            //保存用户到数据库
            managerService.insert(manager);
            return "插入成功";
        }
        return "您无权进行注册工作！";
    }
    /*
    * 实现删除功能
    * 三级用户: 超级管理员root、区域经理manager、保安simple
    * 加到一个接口里
    * */
    @PostMapping("/delete")
    public String delete(@RequestParam int manage_id,HttpServletRequest request){
        String identity = request.getParameter("identity");
        if (identity.equals("root")){
            managerService.delete(manage_id);
            return "超级管理删除经理成功!";
        }else if (identity.equals("manager")){
            managerService.delete(manage_id);
            return "区域经理删除保安成功";
        }
        return "您无权进行删除工作";
    }

    /*
    * 实现修改功能
    * 三级用户: 超级管理员root、区域经理manager、保安simple
    * 加到一个接口里
    * */

    /*
     * 查询所有的用户--包括root、manager和simple
     * */
    @GetMapping("/findAll")
    public List<Manager> findAll(){
        return managerService.findAll();
    }

}
