package com.yyh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @SpringBootApplication  标注 此类是一个 springboot应用    APP
 * @author YanYuHang
 * @create 2020-01-01-14:35
 */
@SpringBootApplication
public class Starter {
    public static void main(String[] args) {
        //应用的入口
        SpringApplication.run(Starter.class,args);
    }
}
