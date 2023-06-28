package com.skillstorm.training.week01.day2;

public class DataTypePractice {
final static float PI = 3.14f;
	
	public static void main(String[] args) {
		//                  -------------
		//                  I need these exact method arguments
		//-------------------------------------------------------------------
		/*
		 * Variable declaration - reserves space in memory
		 * 
		 * Variable initialization - assigns an initial value
		 * 
		 * Assignment and Reassignment - changes the values stored (overwrites it)
		 */
		int myFavoriteNumber; // declaration
		
		// System.out.println(myFavoriteNumber);
		
		myFavoriteNumber = 11; // initialition
		
		System.out.println("myFavoriteNumber=" + myFavoriteNumber);
		
		myFavoriteNumber = 3;
		
		System.out.println("myFavoriteNumber=" + myFavoriteNumber + "\n");
		
		// final tells Java this is a constant so never let it be reassigned
		//  by convention use CAPSLOCK and snake_case
		// PI = 1.1; // can't reassign this bc it's final
		
		//----------------------------------------------------------------------
		
		/* EXERCISE: Print out the values below
		      Integer is a "wrapper class" we'll talk about later
		
		int max = Integer.MAX_VALUE; 
		int x = Integer.MAX_VALUE + 1;
		int min = Integer.MIN_VALUE;
		int y = Integer.MIN_VALUE - 1;
		int z = Integer.MIN_VALUE + Integer.MAX_VALUE;

		*/
		
		int max = Integer.MAX_VALUE;
		int x = Integer.MAX_VALUE + 1;
		int min = Integer.MIN_VALUE;
		int y = Integer.MIN_VALUE - 1;
		int z = Integer.MIN_VALUE + Integer.MAX_VALUE;
		// System.out.println(max, x); won't work bc java doesn't understand ,
		System.out.println(max + ", " + x); 
		System.out.println("max=" + max);
		System.out.println("x=" + x);
		System.out.println("min=" + min);
		System.out.println("y=" + y);
		System.out.println("z=" + z);
		
		
		System.out.println();
		System.out.println();
		System.out.println();
		// What will this print out?
		System.out.println("11" + 1); 
		
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Short.MAX_VALUE);
		// 
	} // end main

}
