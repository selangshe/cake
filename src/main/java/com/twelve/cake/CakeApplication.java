package com.twelve.cake;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@EnableScheduling
@MapperScan("com.twelve.cake.db.mapper")
public class CakeApplication {

    public static void main(String[] args) {
        SpringApplication.run(CakeApplication.class, args);
    }

}
