package com.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class GreetingsTest {
	Greetings  greet;
	
	
	@BeforeEach
	void setUp() throws Exception {
		greet = new   Greetings();
	}

	@AfterEach
	void tearDown() throws Exception {
		greet =null;
	}

	@Test
	void test() {
		String  msg ="Have a Happy & Healthy Day";
		String  result =greet.message();
		assertEquals(msg, result);
		
 	}

}
