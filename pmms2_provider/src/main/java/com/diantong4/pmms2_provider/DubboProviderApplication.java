package com.diantong4.pmms2_provider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:dubbo_provider.xml")
@MapperScan("com.diantong4.pmms2_provider.dao")
public class DubboProviderApplication {

    public static void main(String[] args) {
        System.out.println("生产者已经启动");
        SpringApplication.run(DubboProviderApplication.class, args);

    }
}
