package com.djtu.vwater;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.djtu.vwater.dal.mapper")
public class VwaterXApplication {

    public static void main(String[] args) {
        SpringApplication.run(VwaterXApplication.class, args);
    }

}
