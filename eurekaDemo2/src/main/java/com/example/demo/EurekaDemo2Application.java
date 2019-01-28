package com.example.demo;

import com.codingapi.txlcn.client.config.EnableDistributedTransaction;
import com.codingapi.txlcn.commons.annotation.DTXPropagation;
import com.codingapi.txlcn.commons.annotation.LcnTransaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@SpringBootApplication
@EnableEurekaClient
@EnableAutoConfiguration
@EnableDistributedTransaction
@EnableScheduling
@RestController
public class EurekaDemo2Application {

	public static void main(String[] args) {
		SpringApplication.run(EurekaDemo2Application.class, args);
	}


	@Value("${server.port}")
	String port;

	@Autowired
	private JdbcTemplate jdbcTemplate;




	@RequestMapping("/hello")
	//@LcnTransaction(propagation = DTXPropagation.SUPPORTS)
	@Transactional
	public String home(@RequestParam("value") String value){
		Items items =new Items();
		items.setName("服务2的数据");
		items.setTitle("服务2的数据");
		items.setDetail("服务2的数据");
//		try {
//			int i =1/0;
//		}catch (Exception e){
//			e.printStackTrace();
//		}
         int b =1/0;
		String sql = "insert into items (id,title,name,detail) VALUES (?,?,?,?)";
		Object args[] = {items.getId(),items.getTitle(),items.getName(),items.getDetail()};
		int temp = jdbcTemplate.update(sql, args);
		if(temp > 0) {
			return "文章新增成功";
		}
		return "新增出现错误";

		//return "hi " + name + " ,i am from port:" + port;
	}
	}


