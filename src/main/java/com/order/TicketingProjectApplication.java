package com.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class TicketingProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(TicketingProjectApplication.class, args);
	}

}
