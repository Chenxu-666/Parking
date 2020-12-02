package com.example.parking_manage.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * @ClassName: Charge
 * @Author: ChenXu
 * @Date: 2020/12/2 11:09
 * @Description: ToDo
 */
@Entity
@Table(name = "charge")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Charge {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "sort")
    private String sort;

    @Column(name = "rent")
    private String rent;

    @Column(name = "hour")
    private String hour;
}
