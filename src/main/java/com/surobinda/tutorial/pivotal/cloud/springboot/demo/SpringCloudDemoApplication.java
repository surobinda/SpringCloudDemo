package com.surobinda.tutorial.pivotal.cloud.springboot.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SpringCloudDemoApplication {

	public static void main(String[] args) {
		System.out.println("test");
		SpringApplication.run(SpringCloudDemoApplication.class, args);
	}
}
