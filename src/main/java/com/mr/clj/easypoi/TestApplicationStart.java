package com.mr.clj.easypoi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName TestApplicationStart
 * @Description: TODO
 * @Author 9
 * @Date 2020/1/6
 * @Version V1.0
 **/
@SpringBootApplication
@MapperScan(value = "com.mr.clj.*.mapper")
public class TestApplicationStart {

    public static void main(String[] args) {
        SpringApplication.run(TestApplicationStart.class);
    }
}