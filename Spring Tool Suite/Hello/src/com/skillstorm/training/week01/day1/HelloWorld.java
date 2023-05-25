package com.skillstorm.training.week01.day1;

//This is a comment (not read by the compiler - useful for notes)

/*
* This is a 
* multiline
* comment.
* Useful for commenting out code.
*/

//packages are like folders, they keep our code organized

public class HelloWorld { // curly braces surround our code
//all of our code needs to be in a class
	
	public static void main(String[] args) { // magic! 
	// MEMORIZE THE ABOVE line of code
	// legal variations that will work
	// public static void main(String args[]) {
	// public static void main(String... args) {
		
		System.out.println("Hello World! I am Erica. This is my first program!"); // every line must end with ;
	
		// No multiline String notation in Java
		System.out.println("Hello \n" + // escape characters start with a \ and tell Java this is not text
				               "world ");
		System.out.println("Hello");
		System.out.println("");
	}

}
