package com.example.demo;

import com.codingapi.txlcn.commons.annotation.LcnTransaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Administrator on 2019/1/24.
 */
@Service
@Order(Integer.MIN_VALUE)
public class DemoServiceImpl implements DemoService {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    SchedualServiceHiDemo3 schedualServiceHiDemo3;

    @Autowired
    SchedualServiceHello schedualServiceHello;
    @Autowired
    SchedualServiceHiDemo4 schedualServiceHiDemo4;

    @Override
    @Transactional
   // @LcnTransaction
    public String execute(String value) {
        Items items =new Items();
        items.setName("服务1的数据");
        items.setTitle("服务1的数据");
        items.setDetail("服务1的数据");
        String sql = "insert into items (id,title,name,detail) VALUES (?,?,?,?)";
        Object args[] = {items.getId(),items.getTitle(),items.getName(),items.getDetail()};
        int temp = jdbcTemplate.update(sql, args);
        schedualServiceHiDemo4.sayHiFromClientFour();
        schedualServiceHiDemo3.sayHiFromClientTrees(value);
       // schedualServiceHello.sayHiFromClientTwo(value);




        return "OK";
    }
}
