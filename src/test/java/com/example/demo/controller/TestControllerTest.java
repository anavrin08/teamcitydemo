package com.example.demo.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestControllerTest {

	@Autowired
	TestController testController;

	@Test
	void getSquaredValue() {
		assertEquals(25, testController.getSquared(5L));
	}

	@Test
	void getSquaredValue2() {
		assertEquals(100, testController.getSquared(10L));
	}

	@Test
	void getSquaredValueFail() {
		assertEquals(20, testController.getSquared(5L));
	}

}
