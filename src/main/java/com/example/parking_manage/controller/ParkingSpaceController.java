package com.example.parking_manage.controller;

import com.example.parking_manage.entity.ParkingSpace;
import com.example.parking_manage.service.ParkingSpaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/ParkingSpace")
public class ParkingSpaceController {

    @Autowired
    private ParkingSpaceService parkingSpaceService;

    /*查找所有的信息啊啊啊啊啊*/
    @GetMapping("/findAll")
    public List<ParkingSpace> findAll() {
        return parkingSpaceService.findAll();
    }

    //根据ps_id进行查找
    @RequestMapping(value = "/findByPs_id", method = RequestMethod.POST)
    public ParkingSpace findByps_id(HttpServletRequest request) {
        String ps_id = request.getParameter("ps_id");
        return parkingSpaceService.findByPs_id(Integer.parseInt(ps_id));
    }

    //根据车牌号查询
    @RequestMapping(value = "/findByCar_number", method = RequestMethod.POST)
    public ParkingSpace findByCar_number(HttpServletRequest request) {
        String car_number = request.getParameter("car_number");
        return parkingSpaceService.findByCar_number(car_number);
    }

    //增加了停车位
    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public String insert(HttpServletRequest request) {
        //获取前端数据
        String pl_id = request.getParameter("pl_id");
        String parking_no = request.getParameter("parking_no");
        System.out.println(pl_id + parking_no);
        if (pl_id != null && parking_no != null) {
            if (parkingSpaceService.isHasParking_no(parking_no) && parkingSpaceService.isHasPl_id(Integer.parseInt(pl_id))) {
                return "已存在车位";
            } else {
                //创建车位
                ParkingSpace p = new ParkingSpace(null, Integer.parseInt(pl_id), "空闲", parking_no, null);
//              //控制台输出用户详细数据，用于查看与记录
                System.out.print("详细：");
                System.out.println(p.toString());
                //插入
                parkingSpaceService.insert(p);
                return "插入成功";
            }
        } else {
            return "接收数据出错";
        }

    }

    //修改车位的信息
    @RequestMapping(value = "/change", method = RequestMethod.POST)
    public String change(HttpServletRequest request) {
        //获取前端数据
        String ps_id = request.getParameter("ps_id");
        String pl_id = request.getParameter("pl_id");
        String status = request.getParameter("status");
        String parking_no = request.getParameter("parking_no");
        String car_number = request.getParameter("car_number");

        if (pl_id != null && parking_no != null) {
            //创建车位
            ParkingSpace p = new ParkingSpace(Integer.parseInt(ps_id), Integer.parseInt(pl_id), status, parking_no, car_number);
            //控制台输出用户详细数据，用于查看与记录
            System.out.print("详细：");
            System.out.println(p.toString());
            //插入
            parkingSpaceService.insert(p);
            return "更新成功";

        } else {
            return "接收数据出错";
        }
    }

}
