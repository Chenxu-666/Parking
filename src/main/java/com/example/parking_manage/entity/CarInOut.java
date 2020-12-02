package com.example.parking_manage.entity;

/**
 * @author ChenDeYou
 * @Date 2020/11/19 15:02
 * @Description
 */
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "car_inout")
public class CarInOut {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "in_out_id")
    private Integer in_out_id;
    @Column(name = "car_number")
    private String car_number;
    @Column(name = "user_id")
    private Integer user_id;
    @Column(name = "in_time")
    private Date in_time;
    @Column(name = "out_time")
    private Date out_time;
    @Column(name = "parking_time")
    private String parking_time;
    @Column(name = "money")
    private Float money;
    @Column(name="month")
    private Boolean month;
    @Column(name="season")
    private Boolean season;
    @Column(name="years")
    private Boolean years;
    @Column(name="hour_within")
    private Float hour_within;
    @Column(name="hour_beyond")
    private Float hour_beyond;


    public CarInOut() {

    }

    public CarInOut(Integer in_out_id,  Integer user_id) {
        this.in_out_id = in_out_id;
        this.car_number = null;
        this.user_id = user_id;
        this.in_time = null;
        this.out_time = null;
        this.parking_time = null;
        this.money = null;
        this.month = false;
        this.season = false;
        this.years = false;
        this.hour_within = null;
        this.hour_beyond = null;
    }

    public Integer getIn_out_id() {
        return in_out_id;
    }

    public void setIn_out_id(Integer in_out_id) {
        this.in_out_id = in_out_id;
    }

    public String getCar_number() {
        return car_number;
    }

    public void setCar_number(String car_number) {
        this.car_number = car_number;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public Date getIn_time() {
        return in_time;
    }

    public void setIn_time(Date in_time) {
        this.in_time = in_time;
    }

    public Date getOut_time() {
        return out_time;
    }

    public void setOut_time(Date out_time) {
        this.out_time = out_time;
    }

    public String getParking_time() {
        return parking_time;
    }

    public void setParking_time(String parking_time) {
        this.parking_time = parking_time;
    }

    public Float getMoney() {
        return money;
    }

    public void setMoney(Float money) {
        this.money = money;
    }

    public Boolean getMonth() {
        return month;
    }

    public void setMonth(Boolean month) {
        this.month = month;
    }

    public Boolean getSeason() {
        return season;
    }

    public void setSeason(Boolean season) {
        this.season = season;
    }

    public Boolean getYears() {
        return years;
    }

    public void setYears(Boolean years) {
        this.years = years;
    }

    public Float getHour_within() {
        return hour_within;
    }

    public void setHour_within(Float hour_within) {
        this.hour_within = hour_within;
    }

    public Float getHour_beyond() {
        return hour_beyond;
    }

    public void setHour_beyond(Float hour_beyond) {
        this.hour_beyond = hour_beyond;
    }

    @Override
    public String toString() {
        return "CarInOut{" +
                "in_out_id=" + in_out_id +
                ", car_number='" + car_number + '\'' +
                ", user_id=" + user_id +
                ", in_time=" + in_time +
                ", out_time=" + out_time +
                ", parking_time='" + parking_time + '\'' +
                ", money=" + money +
                ", month=" + month +
                ", season=" + season +
                ", years=" + years +
                ", hour_within=" + hour_within +
                ", hour_beyond=" + hour_beyond +
                '}';
    }
}
