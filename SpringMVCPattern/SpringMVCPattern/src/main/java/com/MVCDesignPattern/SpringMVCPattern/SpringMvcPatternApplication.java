package com.MVCDesignPattern.SpringMVCPattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringMvcPatternApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMvcPatternApplication.class, args);
	}

}
// if we are add DevTools Dependency then our server will stop automatically
// there is no need to start and stop server every time to developer
//for Enterprise Web application then add below Dependencies
//1)Lombok,2)Thymeleaf,3)DEV Tools,4)Web App