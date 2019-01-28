package com.example.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Administrator on 2019/1/22.
 */
@FeignClient(value = "service-heloo")
public interface SchedualServiceHello {
    @GetMapping(value = "/hello")
    String sayHiFromClientTwo(@RequestParam("value") String name);
}
