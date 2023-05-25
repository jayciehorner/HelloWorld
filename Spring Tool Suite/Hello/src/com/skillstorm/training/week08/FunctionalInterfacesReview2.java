package com.skillstorm.training.week08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FunctionalInterfacesReview2 {
	static List<Integer> nums = new ArrayList<>();

	// Example 1: Find number based on given criteria
	public static Integer findNumberBasedOnCriteria(Finder<Integer> fb) { // Finder is a target type that could take a
																			// lambda!
		return fb.compare(nums);
	}

	public static void main(String[] args) {
//		FindSmallestInteger fb2 = new FindSmallestInteger();
//		Integer smallest = findNumberBasedOnCriteria(fb2);
//		System.out.println("smallest is " + smallest);
		Scanner in = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.println("Please enter a whole number: ");
			Integer num = in.nextInt();
			in.nextLine();
			nums.add(num);
		}
		in.close();
//		FindMedianInteger fb3 = new FindMedianInteger();
//		Integer median = findNumberBasedOnCriteria(fb3);
//		System.out.println("Median is " + median);
//
//		FindSmallestInteger fb2 = new FindSmallestInteger();
//		Integer smallest = findNumberBasedOnCriteria(fb2);
//		System.out.println("smallest is " + smallest);

		// lambda expression to find smallest integer
		Integer smallest1 = findNumberBasedOnCriteria((values) -> {
			Integer smallest = Integer.MAX_VALUE;
			for (Integer num : values) { // loop through
				smallest = Math.min(smallest, num);
			}
			return smallest;
		});
		System.out.println("smallest is " + smallest1);

		// find median using existing FindMedianInteger class
		FindMedianInteger fb3 = new FindMedianInteger();
		Integer median = findNumberBasedOnCriteria(fb3);
		System.out.println("Median is " + median);
	}

}

// Functional Interface
@FunctionalInterface
interface Finder<T> {

	T compare(List<T> values);

}

//example :
/*
 * () -> {
 * 
 * String str = "dun-dun-dun ";
 * 
 * for (int i = 0; i < 10; i++) { System.out.print(str); }
 * 
 * }
 */

// Implementing Class that compares Integers
//class FindSmallestInteger implements Finder<Integer> {
//
//	/**
//	 * Takes in any number of Integers, loops through and returns the biggest
//	 * Integer
//	 * 
//	 * @param The values to compare
//	 * @return The biggest Integer in the list
//	 */
//	@Override
//	public Integer compare(List<Integer> values) {
//		Integer largest = Integer.MAX_VALUE;
//		for (Integer num : values) { // loop through
//			largest = Math.min(largest, num);
//		}
//		return largest;
//	}
//
//}

//Implementing Class that compares Integers
class FindMedianInteger implements Finder<Integer> {

	/**
	 * Takes in any number of Integers, loops through and returns the biggest
	 * Integer
	 * 
	 * @param The values to compare
	 * @return The biggest Integer in the list
	 */
	@Override
	public Integer compare(List<Integer> values) {
		// median - the middle number (or the average of the two middle numbers)
		// sort list
		values.sort(null);
		// if odd number of elements return the middle
		if (values.size() % 2 == 1) {
			// middle element of 1, 2, 3, 4, 5 is 3 at index 2
			return values.get(values.size() / 2);
		} else {
			// middle elements of [1, 2, 3, 4] are 2 and 3 at index 1 and 2
			int elem1 = values.get(values.size() / 2);
			int elem2 = values.get(values.size() / 2 - 1);
			return (elem1 + elem2) / 2;
		}
	}

}
