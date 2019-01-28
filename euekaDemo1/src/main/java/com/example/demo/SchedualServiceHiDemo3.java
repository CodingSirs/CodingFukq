package com.example.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Administrator on 2019/1/22.
 */
@FeignClient(value = "eureka-demo3")
public interface SchedualServiceHiDemo3 {
    @RequestMapping(value = "/test",method = RequestMethod.GET)
    String sayHiFromClientTrees(@RequestParam("value") String name);
}
