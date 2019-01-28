package com.example.demo;

import com.codingapi.txlcn.client.config.EnableDistributedTransaction;
import com.codingapi.txlcn.commons.annotation.DTXPropagation;
import com.codingapi.txlcn.commons.annotation.LcnTransaction;
import com.codingapi.txlcn.commons.annotation.TxcTransaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;
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
@EnableFeignClients
public class EurekaDemo3Application {

	public static void main(String[] args) {
		SpringApplication.run(EurekaDemo3Application.class, args);
	}

	@Value("${server.port}")
	String port;

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Autowired
	SchedualServiceHello schedualServiceHello;


	@RequestMapping("/test")
	//@LcnTransaction
	@Transactional
	public String home(@RequestParam(value = "name", defaultValue = "fukq") String name) {
		Items items =new Items();
		items.setName("服务3的数据");
		items.setTitle("服务3的数据");
		items.setDetail("服务3的数据");
		String sql = "insert into items (id,title,name,detail) VALUES (?,?,?,?)";
		Object args[] = {items.getId(),items.getTitle(),items.getName(),items.getDetail()};
		int temp = jdbcTemplate.update(sql, args);
		schedualServiceHello.sayHiFromClientTwo(name);
		if(temp > 0) {
			return "文章新增成功";
		}
		return "新增出现错误";

	}
}

