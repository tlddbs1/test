package com.gradle.biz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.gradle.biz")
public class GradleMultiBizApplication {

	public static void main(String[] args) {
		SpringApplication.run(GradleMultiBizApplication.class, args);
	}

}
