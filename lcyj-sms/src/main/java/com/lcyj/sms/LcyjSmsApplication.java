package com.lcyj.sms;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@MapperScan(basePackages = {"com.lcyj.sms.dao.mapper"})
@ComponentScan(basePackages = {"com.lcyj.sms"})
public class LcyjSmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(LcyjSmsApplication.class, args);
    }

}
