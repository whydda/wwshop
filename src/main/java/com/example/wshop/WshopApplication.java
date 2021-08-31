package com.example.wshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class WshopApplication {

	public static void main(String[] args) {
		SpringApplication.run(WshopApplication.class, args);
	}

}
