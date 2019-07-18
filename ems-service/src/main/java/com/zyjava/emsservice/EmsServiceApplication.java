package com.zyjava.emsservice;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;


@ImportResource(locations = {"classpath:spring/spring-mybatis.xml"})
@EnableDubbo
@SpringBootApplication
public class EmsServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmsServiceApplication.class, args);
    }

}
