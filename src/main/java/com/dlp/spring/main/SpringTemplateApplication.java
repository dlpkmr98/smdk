package com.dlp.spring.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan("com.dlp.spring")
public class SpringTemplateApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringTemplateApplication.class, args);
	}
}
