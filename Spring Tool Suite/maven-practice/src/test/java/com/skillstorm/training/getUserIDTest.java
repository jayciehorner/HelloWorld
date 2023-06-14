package com.skillstorm.training;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class getUserIDTest {
	static String[] tests = new String[] { 
			"https://www.skillstorm.store.com/user/12345/cart",
			"https://www.skillstorm.store.com/user/12345/", 
			"https://www.skillstorm.store.com/cart" };

	@Test
	void testSuccessInMiddle() {
		assertEquals("12345", GroupWork.getUserID(tests[0]));
	}

	@Test
	void testSuccessAtEnd() {
		assertEquals("12345", GroupWork.getUserID(tests[2]));
	}

	@Test
	void testFailure() {
		assertThrows(IllegalArgumentException.class, () -> {
			GroupWork.getUserID(tests[3]);
		});
	}
}
