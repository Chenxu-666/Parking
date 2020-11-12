package com.example.parking_manage.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="news")
public class News {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "new_id")
    private Integer new_id;

    @Column(name = "title")
    private String title;

    @Column(name = "content")
    private String content;

    @Column(name = "begin_time")
    private Date begin_time;

    @Column(name = "end_time")
    private Date end_time;

    @Column(name = "type")
    private  String type;

    public News() {

    }

    public News(Integer new_id, String title, String content, Date begin_time, Date end_time, String type) {
        this.new_id = new_id;
        this.title = title;
        this.content = content;
        this.begin_time = begin_time;
        this.end_time = end_time;
        this.type = type;
    }

    public Integer getNew_id() {
        return new_id;
    }

    public void setNew_id(Integer new_id) {
        this.new_id = new_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getBegin_time() {
        return begin_time;
    }

    public void setBegin_time(Date begin_time) {
        this.begin_time = begin_time;
    }

    public Date getEnd_time() {
        return end_time;
    }

    public void setEnd_time(Date end_time) {
        this.end_time = end_time;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "News{" +
                "new_id=" + new_id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", begin_time=" + begin_time +
                ", end_time=" + end_time +
                ", type='" + type + '\'' +
                '}';
    }
}
