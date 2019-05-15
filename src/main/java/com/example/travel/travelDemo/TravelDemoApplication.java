package com.example.travel.travelDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@ComponentScan(basePackages = "com.example.travel.travelDemo")
@EnableSwagger2
@SpringBootApplication
public class TravelDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TravelDemoApplication.class, args);
	}

}
