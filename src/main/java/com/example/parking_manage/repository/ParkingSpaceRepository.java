package com.example.parking_manage.repository;

import com.example.parking_manage.entity.ParkingSpace;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ParkingSpaceRepository extends JpaRepository<ParkingSpace, Integer> , JpaSpecificationExecutor<ParkingSpace> {

    @Query(value = "from ParkingSpace where ps_id = ?1")
    ParkingSpace findByPs_id(Integer ps_id);

    @Query(value = "from ParkingSpace where pl_id = ?1")
    ParkingSpace findByPl_id(Integer pl_id);

    @Query(value= "from ParkingSpace where car_number = ?1")
    ParkingSpace findByCar_number(String car_number);

    @Query(value= "from ParkingSpace where parking_no = ?1")
    ParkingSpace findByParking_no(String parking_no);


}
