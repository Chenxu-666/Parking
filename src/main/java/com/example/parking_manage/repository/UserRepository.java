package com.example.parking_manage.repository;

import com.example.parking_manage.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    @Query("select a from User a where a.user_name=?1")
    List<User> findByUser_name(String name);

    @Query("select a from User a where a.email=?1")
    List<User> findByEmail(String email);
}
