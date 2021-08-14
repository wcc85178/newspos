package com.shiyi.sapp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.shiyi.sposdao.dao")
@SpringBootApplication
public class SappApplication {

	public static void main(String[] args) {
		SpringApplication.run(SappApplication.class, args);
	}

}
