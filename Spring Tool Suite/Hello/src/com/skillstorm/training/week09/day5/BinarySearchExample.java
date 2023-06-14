package com.skillstorm.training.week09.day5;

import java.util.Arrays;
import java.util.Random;

public class BinarySearchExample {
	
	public static void main(String[] args) {
		int [] nums = create(5);
		print(nums);
		int existingValue = nums[new Random().nextInt(nums.length)];
				System.out.println("Value to search for is " + existingValue);
				
				int tooBig = nums[nums.length - 1] + 10;
				System.out.println("Value too big but trying to find anyways " + tooBig);
				int tooSmall = nums[0] - 10;
				System.out.println("Value too small but trying to find anyways " + tooSmall);
				System.out.println();
				System.out.println("Found value " + existingValue + " at index " + binarySearch(nums, existingValue));
				System.out.println("Found value " + tooBig + " at index " + binarySearch(nums, tooBig));
				System.out.println("Found value " + tooSmall + " at index " + binarySearch(nums, tooBig));
				int firstValue = nums[0];
				int lastValue = nums[nums.length - 1];
				
				System.out.println("Found value " + firstValue + " at index " + binarySearch(nums, firstValue));
				System.out.println("Found value " + lastValue + " at index " + binarySearch(nums, lastValue));
				
				int hopefullyDoesntExist = nums[0] + 10;
				System.out.println("Found value " + hopefullyDoesntExist + " at index " + binarySearch(nums, hopefullyDoesntExist));
	}

	public static int binarySearch(int[] nums, int value) {
		int start = 0;
		int end = nums.length - 1;
		// iterative loop
		while (start <= end) {
			int middleIndex = (start + end) / 2;
			int middleValue = nums[middleIndex];

			if (value == middleValue)
				return middleIndex;
			if (value < middleValue) {
					end = middleIndex -1;
			} else {
				start = middleIndex +1;

			}

		}
		return -1;
	}
	public static int[] create(int size) {
		Random generator = new Random();
		int[] nums = new int[size];
		for (int i = 0; i < size; i++) {
			nums[i] = generator.nextInt(100);
		}
		Arrays.sort(nums);
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
