package com.example.parking_manage.service;

import com.example.parking_manage.repository.NewsRepository;
import com.example.parking_manage.entity.News;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsService {

    @Autowired
    private NewsRepository newsRepository;

    //    插入和更新
    public News insert(News u){
        return newsRepository.save(u);
    }

    //    查询全部的news
    public List<News> findAll(){
        return newsRepository.findAll();
    }
    //查询系统的公告
    public List<News> findByNewsType1(String type){
        return newsRepository.findByNewsType1(type);
    }
    //    查询停车场的公告
    public List<News> findByNewsType2(String type){
        return newsRepository.findByNewsType2(type);
    }

}
