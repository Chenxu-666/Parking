package com.example.parking_manage.controller;

import com.example.parking_manage.entity.News;
import com.example.parking_manage.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

@RestController
@RequestMapping("/news")
public class NewsController {

    @Autowired
    private NewsService newsService;

    @GetMapping("findAll")
    @ResponseBody
    public List<News> findAll(){
        return newsService.findAll();
    }

    //根据type查询公告
    @RequestMapping(value = "/findByNewsType", method = RequestMethod.GET)
    public List<News> findByNewsType(HttpServletRequest request) {
        //获取前端数据
        String type = request.getParameter("type");
        System.out.println("查询公告的类型是" + type);
        if (type != null) {
            if (type == "s") {
//                System.out.println(newsService.findBynewsType1("s"));
                return newsService.findByNewsType1("s");
            } else if (type == "p") {
                return newsService.findByNewsType2("p");
            } else {
                return null;
            }
        }
        return null;
    }

    //插入新的公告
    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public String insert(HttpServletRequest request) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String title = request.getParameter("title");
        String content = request.getParameter("content");
        String begin_time = request.getParameter("content");
        String end_time = request.getParameter("content");
        String type = request.getParameter("content");
        System.out.println(title + content + begin_time + end_time + type);
        if (title != null && content != null && begin_time != null && end_time != null && type != null) {
            if (type == "s" || type == "p") {
                News news = new News(null, title, content, sdf.parse(begin_time), sdf.parse(end_time), type);
                newsService.insert(news);
                return "插入成功";
            } else {
                return "插入失败";
            }
        }
        return "插入失败";
    }

}
