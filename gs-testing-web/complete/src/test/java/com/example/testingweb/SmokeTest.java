package com.example.testingweb;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;



//The @SpringBootTest annotation tells Spring Boot to look for a main configuration class 
//(one with @SpringBootApplication, for instance)
//and use that to start a Spring application context.


@SpringBootTest
public class SmokeTest {

	@Autowired
	private HomeController controller;

//	Spring interprets the @Autowired annotation, and the controller 
//	is injected before the test methods are run. 
//	We use AssertJ (which provides assertThat() and other methods) to express the test assertions.
	@Test
	public void contextLoads() throws Exception {
		assertThat(controller).isNotNull();
	}
}
