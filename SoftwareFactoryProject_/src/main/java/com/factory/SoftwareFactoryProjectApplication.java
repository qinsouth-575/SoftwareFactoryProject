package com.factory;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.factory.mapper")
public class SoftwareFactoryProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SoftwareFactoryProjectApplication.class, args);
	}

}
