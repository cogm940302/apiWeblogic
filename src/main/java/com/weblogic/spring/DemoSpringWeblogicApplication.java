package com.weblogic.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.weblogic.*")
public class DemoSpringWeblogicApplication {

	private static ApplicationContext applicationContext;

	public static void main(String[] args) {
		applicationContext = 
		          new AnnotationConfigApplicationContext(DemoSpringWeblogicApplication.class);

		        for (String beanName : applicationContext.getBeanDefinitionNames()) {
		            System.out.println(beanName);
		        }
		SpringApplication.run(DemoSpringWeblogicApplication.class, args);
	}

	@Bean
	public String algo4() {
		System.out.println("entre en algo4");
		return "";
	}
}
