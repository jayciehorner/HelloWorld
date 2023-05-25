package com.skillstorm.training.week08;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FunctionalInterfacesReview {
	// Example 1: Find number based on given criteria
		public static Integer findNumberBasedOnCriteria(FindBiggest<Integer> fb) { // FindBiggest is a target type that could take a lambda!
			List<Integer> nums = new ArrayList<>();
			Scanner in = new Scanner(System.in);
			for (int i = 0; i < 5; i++) {
				System.out.println("Please enter a whole number: ");
				Integer num = in.nextInt();
				nums.add(num);
			}
			in.close();
			return fb.compare(nums);
		}

		public static void main(String[] args) {
			// Create an instance of the class implementing FindBiggest
			FindBiggestInteger fb = new FindBiggestInteger();
//			FindBiggest<Integer> fb2 = new FindBiggestInteger(); // polymorphism lets me use a super type
			Integer biggest = findNumberBasedOnCriteria(fb);
			System.out.println(biggest);
		}

	}

	// Functional Interface
	@FunctionalInterface
	interface FindBiggest<T> {

		T compare(List<T> values);

	}

	// Implementing Class that compares Integers
	class FindBiggestInteger implements FindBiggest<Integer> {

		/**
		 * Takes in any number of Integers, loops through and returns the biggest
		 * Integer
		 * 
		 * @param The values to compare
		 * @return The biggest Integer in the list
		 */
		@Override
		public Integer compare(List<Integer> values) {
			Integer largest = Integer.MIN_VALUE;
			for (Integer num : values) { // loop through
				largest = Math.max(largest, num);
			}
			return largest;
		}

}

