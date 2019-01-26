package com.glqdlt.booktstroe.webappserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.glqdlt.bookstore.**")
@SpringBootApplication
public class WebAppServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebAppServerApplication.class, args);
	}

}

