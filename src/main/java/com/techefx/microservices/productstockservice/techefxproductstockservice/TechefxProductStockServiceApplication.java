package com.techefx.microservices.productstockservice.techefxproductstockservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// In earlier versions, we also had to mention DiscoveryClient annotation here for registering with naming server but now it's no longer mandatory.
public class TechefxProductStockServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(TechefxProductStockServiceApplication.class, args);
    }

}
