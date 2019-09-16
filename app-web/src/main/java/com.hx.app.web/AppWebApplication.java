package com.hx.app.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Description：
 *
 * @author: liu.hx
 * @date: 2019-07-30  14:24
 */
@SpringBootApplication(scanBasePackages = "com.hx.app")
@MapperScan("com.hx.dao.mapper")
@EnableJpaRepositories
public class AppWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(AppWebApplication.class, args);
    }
}
