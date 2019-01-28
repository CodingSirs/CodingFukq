package com.example.demo;

import com.codingapi.txlcn.client.config.EnableDistributedTransaction;
import com.codingapi.txlcn.commons.annotation.LcnTransaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@EnableAutoConfiguration
@EnableDistributedTransaction
@EnableScheduling
@RestController
@EnableFeignClients
public class SericeFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(SericeFeignApplication.class, args);


	}



	@Autowired
	private JdbcTemplate jdbcTemplate;




	@GetMapping("/hefeign")
	//@LcnTransaction
	@Transactional
	public String home() {
		Items items =new Items();
		items.setName("服务feign的数据");
		items.setTitle("服务feign的数据");
		items.setDetail("服务feign的数据");
	//	int i =1/0;
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

