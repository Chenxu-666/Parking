package com.example.parking_manage.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "user_name")
    private String user_name;
    @Column(name = "sex")
    private String sex;
    @Column(name = "age")
    private int age;
    @Column(name = "birthday")
    private Date birthday;
    @Column(name = "phone_number")
    private String phone_number;
    @Column(name = "email")
    private String email;
    @Column(name = "account_number")
    private String account_number;
    @Column(name = "account_password")
    private String account_password;
    @Column(name = "car_number")
    private String car_number;
    @Column(name = "identity")
    private String identity;
    @Column(name = "status")
    private String status;
    @Column(name = "create_card_time")
    private Date create_card_time;
    @Column(name = "modify_card_time")
    private Date modify_card_time;
    @Column(name = "balance")
    private Double balance;
    @Column(name = "memo")
    private String memo;


    public User(){

    }


    public User(int id, String user_name, String sex, int age, Date birthday, String phone_number, String email, String account_number, String account_password, String car_number, String identity, String status, Date create_card_time, Date modify_card_time, Double balance, String memo) {
        this.id = id;
        this.user_name = user_name;
        this.sex = sex;
        this.age = age;
        this.birthday = birthday;
        this.phone_number = phone_number;
        this.email = email;
        this.account_number = account_number;
        this.account_password = account_password;
        this.car_number = car_number;
        this.identity = identity;
        this.status = status;
        this.create_card_time = create_card_time;
        this.modify_card_time = modify_card_time;
        this.balance = balance;
        this.memo = memo;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", user_name='" + user_name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                ", phone_number='" + phone_number + '\'' +
                ", email='" + email + '\'' +
                ", account_number='" + account_number + '\'' +
                ", account_password='" + account_password + '\'' +
                ", car_number='" + car_number + '\'' +
                ", identity='" + identity + '\'' +
                ", status='" + status + '\'' +
                ", create_card_time=" + create_card_time +
                ", modify_card_time=" + modify_card_time +
                ", balance=" + balance +
                ", memo='" + memo + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAccount_number() {
        return account_number;
    }

    public void setAccount_number(String account_number) {
        this.account_number = account_number;
    }

    public String getAccount_password() {
        return account_password;
    }

    public void setAccount_password(String account_password) {
        this.account_password = account_password;
    }

    public String getCar_number() {
        return car_number;
    }

    public void setCar_number(String car_number) {
        this.car_number = car_number;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getCreate_card_time() {
        return create_card_time;
    }

    public void setCreate_card_time(Date create_card_time) {
        this.create_card_time = create_card_time;
    }

    public Date getModify_card_time() {
        return modify_card_time;
    }

    public void setModify_card_time(Date modify_card_time) {
        this.modify_card_time = modify_card_time;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }
}
