package com.genil.microservices.itsme360;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.WebApplicationInitializer;

@ComponentScan
@SpringBootApplication
public class ItsMe360Application extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(ItsMe360Application.class, args);
	}
}
