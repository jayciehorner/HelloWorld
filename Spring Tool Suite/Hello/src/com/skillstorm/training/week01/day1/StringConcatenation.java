package com.skillstorm.training.week01.day1;

public class StringConcatenation {
	public static void main(String[] args) {
		System.out.println("Erica" + "Hicks"); // concatenation appends Hicks to Erica without space btwn
		System.out.println("Erica " + "Hicks");
		
		System.out.println("----Grocery List------");
		System.out.print("bananas, "); // print will not add a newline after the String of characters printed
		System.out.print("milk, ");
		System.out.println("toothpaste");
		System.out.println("---done---");
	}
}
