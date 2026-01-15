package com.huyvo.spring_template;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.autoconfigure.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class SpringBootTemplate{
	public static void main(String[] args) {
		SpringApplication.run(SpringBootTemplate.class, args);
	}

}
