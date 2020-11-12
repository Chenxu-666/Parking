package com.example.parking_manage.service;

import com.example.parking_manage.entity.ParkingSpace;
import com.example.parking_manage.repository.ParkingSpaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParkingSpaceService {


    @Autowired
    private ParkingSpaceRepository parkingSpaceRepository;

    //    查找停车场的所有信息
    public List<ParkingSpace> findAll() {
        return parkingSpaceRepository.findAll();
    }

    public ParkingSpace findByPs_id(Integer ps_id) {
        return parkingSpaceRepository.findByPs_id(ps_id);
    }

    public ParkingSpace findByCar_number(String car_number) {
        return parkingSpaceRepository.findByCar_number(car_number);
    }

    //    //插入 and 更新
    public ParkingSpace insert(ParkingSpace p){
        return parkingSpaceRepository.save(p);
    }

    //判断是否有停车场
    public boolean isHasPl_id(Integer id){
        ParkingSpace u = parkingSpaceRepository.findByPl_id(id);
        if(u == null){
            return false;
        }
        else{
            return true;
        }
    }

    //判断是否存在这个车位
    public boolean isHasParking_no(String parking_no){
        ParkingSpace u = parkingSpaceRepository.findByParking_no(parking_no);
        if(u == null){
            return false;
        }
        else{
            return true;
        }
    }
}
