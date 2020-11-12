package com.example.parking_manage.repository;

import com.example.parking_manage.entity.News;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NewsRepository extends JpaRepository<News, Integer> {

    @Query("select a from News a where a.type='s'")
    List<News> findByNewsType1(String type);

    @Query("select a from News a where a.type='p'")
    List<News> findByNewsType2(String type);

}
