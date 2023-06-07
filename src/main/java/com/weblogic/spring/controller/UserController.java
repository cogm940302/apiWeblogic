package com.weblogic.spring.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.weblogic.spring.config.RestConfigsProperties;
import com.weblogic.spring.entity.User;
import com.weblogic.spring.repository.UserRepository;

@RestController
public class UserController {
	@Autowired
	UserRepository userRepository;
	@Autowired
	RestConfigsProperties restConfigsProperties;

	@GetMapping("/search")
	public List<User> crearUsuario() {
		System.out.println("application.properties "+restConfigsProperties.getHello());
		return (List<User>) userRepository.findAll();
	}

	@PostMapping(path = "/create", consumes = "application/json", produces = "application/json")
	public ResponseEntity<Map<String, String>> crearUsuarios(@RequestBody User data) {
		try {
			userRepository.save(data);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);

		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);

		}
	}

}
