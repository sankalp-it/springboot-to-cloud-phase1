package com.technet.ms.standalone.productservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
//@ComponentScan(basePackages = {"com.technet.ms.standalone.productservice.application","com.technet.ms.standalone.productservice.model","com.technet.ms.standalone.productservice.service","com.technet.ms.standalone.productservice.repository","com.technet.ms.standalone.productservice.controller"})
//@EnableDiscoveryClient
public class ProductServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProductServiceApplication.class, args);
    }
}