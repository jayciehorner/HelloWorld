package com.skillstorm.training;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
/*
 * @SpringBootApplication -- tells Spring Boot to do 3 things:
 * 		@Configuration
 * 		@EnableAutoConfiguration
 * 		@ComponentScan -- this scans the package for your code searching for classes annotated as @Component
 */
public class SpringBootPractice1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootPractice1Application.class, args);
	}

}
