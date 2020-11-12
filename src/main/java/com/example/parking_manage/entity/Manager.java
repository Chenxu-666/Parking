package com.example.parking_manage.entity;

import javax.persistence.*;

@Entity
@Table(name="manage_user")
public class Manager {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "manage_id")
    private int manage_id;

    @Column(name = "parent_id")
    private int parent_id;

    @Column(name = "manage_name")
    private String manage_name;

    @Column(name =  "manage_password")
    private String manage_password;

    @Column(name = "identity")
    private String identity;

    @Column(name = "phone_number")
    private String phone_number;

    public Manager() {
    }

    public Manager(int manage_id,int parent_id,String manage_name,String manage_password,
                   String identity,String phone_number){
        this.manage_id = manage_id;
        this.parent_id = parent_id;
        this.manage_name = manage_name;
        this.manage_password = manage_password;
        this.identity = identity;
        this.phone_number = phone_number;
    }

    public int getManage_id() {
        return manage_id;
    }

    public void setManage_id(int manage_id) {
        this.manage_id = manage_id;
    }

    public int getParent_id() {
        return parent_id;
    }

    public void setParent_id(int parent_id) {
        this.parent_id = parent_id;
    }

    public String getManage_name() {
        return manage_name;
    }

    public void setManage_name(String manage_name) {
        this.manage_name = manage_name;
    }

    public String getManage_password() {
        return manage_password;
    }

    public void setManage_password(String manage_password) {
        this.manage_password = manage_password;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "manage_id=" + manage_id +
                ", parent_id=" + parent_id +
                ", manage_name='" + manage_name + '\'' +
                ", manage_password='" + manage_password + '\'' +
                ", identity='" + identity + '\'' +
                ", phone_number='" + phone_number + '\'' +
                '}';
    }
}
