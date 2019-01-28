package com.example.demo;

import com.codingapi.txlcn.commons.annotation.TxTransaction;
import com.sun.org.apache.bcel.internal.generic.ISTORE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2019/1/22.
 */
@RestController
public class HiController {
    @Autowired
    DemoService demoService;
    @Autowired
    StringRedisTemplate stringRedisTemplate;

    @GetMapping(value = "/hi")
    public String sayHi(String value) {
        //stringRedisTemplate.opsForValue().set("keys0122", "dateTest");

            return demoService.execute(value);

    }
}
