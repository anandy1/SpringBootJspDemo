package com.avishek.viewJspDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com.avishek"})

public class ViewJspDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ViewJspDemoApplication.class, args);
	}

}
