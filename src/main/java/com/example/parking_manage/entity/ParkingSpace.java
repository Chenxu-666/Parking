package com.example.parking_manage.entity;

import javax.persistence.*;

@Entity
@Table(name = "parking_space")
public class ParkingSpace {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ps_id")
    private Integer ps_id;
    //停车场的id
    @Column(name = "pl_id")
    private Integer pl_id;
    //车位的状态
    @Column(name = "status")
    private String status;
    //    车位在停车场内的区域编号
    @Column(name = "parking_no")
    private String parking_no;
    //车牌号
    @Column(name="car_number")
    private String car_number;

    public ParkingSpace(){

    }

    public ParkingSpace(Integer ps_id, Integer pl_id, String status, String parking_no, String car_number) {
        this.ps_id = ps_id;
        this.pl_id = pl_id;
        this.status = status;
        this.parking_no = parking_no;
        this.car_number = car_number;
    }

    public Integer getPs_id() {
        return ps_id;
    }

    public void setPs_id(Integer ps_id) {
        this.ps_id = ps_id;
    }

    public Integer getPl_id() {
        return pl_id;
    }

    public void setPl_id(Integer pl_id) {
        this.pl_id = pl_id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getParking_no() {
        return parking_no;
    }

    public void setParking_no(String parking_no) {
        this.parking_no = parking_no;
    }

    public String getCar_number() {
        return car_number;
    }

    public void setCar_number(String car_number) {
        this.car_number = car_number;
    }

    @Override
    public String toString() {
        return "ParkingSpace{" +
                "ps_id=" + ps_id +
                ", pl_id=" + pl_id +
                ", status='" + status + '\'' +
                ", parking_no='" + parking_no + '\'' +
                ", car_number='" + car_number + '\'' +
                '}';
    }
}
