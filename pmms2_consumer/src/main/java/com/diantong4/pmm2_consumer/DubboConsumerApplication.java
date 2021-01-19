package com.diantong4.pmm2_consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:dubbo_consumer.xml")
public class DubboConsumerApplication {
    public static void main(String[] args) {
        System.setProperty("spring.devtools.restart.enabled", "false");
        System.out.println("生产者已经启动");
        SpringApplication.run(DubboConsumerApplication.class, args);
    }
}
