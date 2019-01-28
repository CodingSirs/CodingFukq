package com.example.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Administrator on 2019/1/22.
 */
@FeignClient(value = "service-feign")
public interface SchedualServiceHiDemo4 {
    @RequestMapping(value = "/hefeign",method = RequestMethod.GET)
    String sayHiFromClientFour();
}
