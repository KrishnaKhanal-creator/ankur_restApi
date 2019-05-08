package com.ankur.inventory.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = { "com.ankur" })
@ComponentScan("com.ankur")
public class InventoryApplication {

	private static AnnotationConfigApplicationContext context;

	public static void main(String[] args) {
		SpringApplication.run(InventoryApplication.class, args);
	}

}
