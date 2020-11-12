package com.example.parking_manage.repository;

import com.example.parking_manage.entity.Manager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ManagerRepository extends JpaRepository<Manager,Integer> {

    @Query("select a from Manager a where a.manage_name=?1")
    List<Manager> findByManager_name(String manage_name);

}
