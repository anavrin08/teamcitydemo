package com.example.demo.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class TestControllerTest {

	@Autowired
	TestController testController;
	
	@Test
	void getSquaredValue() {
		assertEquals(25, testController.getSquared(5L));
	}
}
