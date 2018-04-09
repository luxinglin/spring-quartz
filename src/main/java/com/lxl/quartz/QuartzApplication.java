package com.lxl.quartz;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author luxinglin
 * @version 1.0
 * @Description: TODO
 * @create 2018-04-09 10:48
 **/
@ComponentScan("com.lxl.quartz")
@MapperScan("com.lxl.quartz.dao")
@SpringBootApplication
public class QuartzApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuartzApplication.class, args);
	}
}
