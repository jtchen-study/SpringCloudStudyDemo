package com.baizhi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
//@EnableDiscoveryClient // 加不加都行
public class Consulclient8889Application {

    public static void main(String[] args) {
        SpringApplication.run(Consulclient8889Application.class, args);
    }

}
