package com.wurui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringbootStudyApplication {
	@Autowired
	private AuthorSettings authorSettings;

	@Value("${my.name}")
	private String myName;

	@RequestMapping("/")
	String index(){
		return "hello spring boot,hi :" + myName + ",author obj:" + authorSettings;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootStudyApplication.class, args);
	}

}

