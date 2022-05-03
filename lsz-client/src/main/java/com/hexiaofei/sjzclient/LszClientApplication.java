package com.hexiaofei.sjzclient;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@EnableFeignClients
@EnableDiscoveryClient
@MapperScan(basePackages = {"com.hexiaofei.sjzclient.dao.mapper"})
@ComponentScan(basePackages = {"com.hexiaofei.sjzclient.service","com.hexiaofei.sjzclient.web"})
@SpringBootApplication
public class LszClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(LszClientApplication.class, args);
	}

}
