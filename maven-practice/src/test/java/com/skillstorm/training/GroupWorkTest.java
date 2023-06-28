package com.skillstorm.training;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class GroupWorkTest {
	/*
	 * Test I would write for the isCSV method:
	 * - for running the test, we'd need to set up some Strings to test with
	 * 		- Something that ends with .csv (Success scenario)
	 * 		- Something that has .csv in middle of String (failure scenario)
	 * 		- Something that doesn't have .csv at all( failure scenario)
	 * 		- Something that is empty (failure scenario)
	 * 		- Something that is null (failure scenario)
	 * 		- Something with capital .CSV (failure scenario)
	 */
	static String[] tests;
	@BeforeAll
	static void initialSetup() {
		//do something here if you need to
		tests = new String[] {"numbers.csv", "my.csv.txt", "", null};
	}
	
	@Test
	void testSuccess() {
//		assertEquals(true, GroupWork.isCSV(tests[0]));
//		assertTrue(GroupWork.isCSV(test[0]);
		
	}
	
	@Test
	void testNullString() {
		assertThrows(IllegalArgumentException.class, () -> {}, "The isCSV method should throw an ");
	}
}
