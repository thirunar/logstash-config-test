package com.logstash.configchecker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class ConfigChecker {

	public static void main(String[] args) {
		SpringApplication.run(ConfigChecker.class, args);
	}
}
