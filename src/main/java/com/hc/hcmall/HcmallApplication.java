package com.hc.hcmall;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.hc.hcmall.mapper")
public class HcmallApplication {

    public static void main(String[] args) {
        SpringApplication.run(HcmallApplication.class, args);
    }

}
