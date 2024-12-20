package com.application.callboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
@ComponentScan
public class CallboardServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CallboardServiceApplication.class, args);
	}

}
