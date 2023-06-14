package com.skillstorm.training.week09.day5;

import java.util.Random;

public class BubbleSortExample {
	public static void main(String[] args) {
		int[] nums = create(5);
		print(nums);
		System.out.println();
		print(sort(nums));

	}
	// Write a generic method that takes an array of any type and sorts using bubble method

	public static int[] sort(int[] arr) {
		// Iterative version of bubble sort
		// TODO add an outer loop
		for (int k = 0; k < arr.length - 1; k++) { System.out.println("Outer loop: ");
			// inner loop compares each element swapping if left is greater than right
			for (int i = 0; i < arr.length - 1 - k; i++) {
				if (arr[i] > arr[i + 1]) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;

				}
				 System.out.print("Loop " + i + ": ");
				 print(arr);
			}
			System.out.println();

		}
		return arr;
	}

	public static int[] create(int size) {
		Random generator = new Random();
		int[] nums = new int[size];
		for (int i = 0; i < size; i++) {
			nums[i] = generator.nextInt(100);
		}
		return nums;
	}

	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			//
		}
		System.out.println("");
	}

}
