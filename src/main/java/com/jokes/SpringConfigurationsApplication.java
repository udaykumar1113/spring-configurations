package com.jokes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:chuck-config.xml")
public class SpringConfigurationsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringConfigurationsApplication.class, args);
	}
}
