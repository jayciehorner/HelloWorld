package com.skillstorm.training;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class getQueryParameterValueTests {

	static String[] tests = new String[] { "https://www.domain.com/page?key1=value1&key2=value2",
			"https://www.domain.com/page?key1=value1&key2=value2;", "Skillstorm.com/user/1234/notaurl" };

	@Test
	void testSuccess() {
		assertEquals("value1", GroupWork.getQueryParameterValue(tests[0], "key1"));
	}

	@Test
	void testIllegalArgument() {
		assertThrows(IllegalArgumentException.class, () -> GroupWork.getQueryParameterValue(tests[2], ""));
	}

	@Test
	@Disabled
	void testNullPointer() {
		assertThrows(NullPointerException.class, () -> GroupWork.getQueryParameterValue(null, null));
	}
}