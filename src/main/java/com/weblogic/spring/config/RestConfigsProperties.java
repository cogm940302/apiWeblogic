package com.weblogic.spring.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * . Clase con las propiedades de configuración de la clase Hello, por defecto
 * dentro del archivo application-xxx.properties se ha decidido que todas
 * aquellas que inicien con el prefijo "custom" pueden ser parseadas con esta
 * clase siempre y cuando tengan una propiedad equivalente. Ejemplo:
 * custom.hello=Hello Será leido por esta clase en la propiedad hello.
 * 
 * @author mrbitfly
 */
@Component
@ConfigurationProperties(prefix = "custom")
public class RestConfigsProperties {
	private String hello;

	public String getHello() {
		return hello;
	}

	public void setHello(String hello) {
		this.hello = hello;
	}

	@Bean
	public String mensaje() {
		System.out.println("voy a imprimir una linea");
		return "";
	}

	
}
