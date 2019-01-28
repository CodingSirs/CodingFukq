package com.example.demo;

/**
 * Created by Administrator on 2019/1/22.
 */
public class Items {
    private Integer id;
    private String title;
    private String name;
    private String detail;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDetail() {
        return detail;
    }
    public void setDetail(String detail) {
        this.detail = detail;
    }
    public Items() {
        super();
        // TODO Auto-generated constructor stub
    }
    public Items(Integer id, String title, String name, String detail) {
        super();
        this.id = id;
        this.title = title;
        this.name = name;
        this.detail = detail;
    }
    @Override
    public String toString() {
        return "Items [id=" + id + ", title=" + title + ", name=" + name + ", detail=" + detail + "]";
    }
}
