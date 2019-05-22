package com.example;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class DemoMybatisplusApplication {
	private static Logger logger = Logger.getLogger(DemoMybatisplusApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(DemoMybatisplusApplication.class, args);
		logger.info("Success!!!");

	}

}
