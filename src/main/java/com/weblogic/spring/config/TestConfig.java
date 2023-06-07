package com.weblogic.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfig {

	@Bean
	public String algo() {
		System.out.println("entre en algo");
		return "";
	}
}
