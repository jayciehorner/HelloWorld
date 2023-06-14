package com.skillstorm.training.week09.day5;

public class RecursionExample2 {
	// Recursion - a function that calls itself
	
	public static void main(String[] args) {
	
	//	System.out.println(reverse("apple"));
		System.out.println(weWereOnABreak("jaycie"));
	}
	
	public static String reverse(String str) {
		String result = "";
		// base case
		if(str.length() <= 1) {
			return str;
		}
		// call reverse method
		return str.charAt(str.length() - 1) + reverse (str.substring(0, str.length() -1));
		
	}
	static String[] bases = { "apples", "bananas", "carrots", "donuts", "end my life for the love of GOD", "foodie", "grapes", "honey", "indigo", "jalepanos", "kiwi", "lemon", "mango", 
			"nectar", "orange", "papaya", "queen", "raspberries", "strawberries", "tangerines", "ukelele", "vex", "yucky", "zebra"};
	
	public static String weWereOnABreak(String name) {
		if (name.length() == 1) {
			return name.toUpperCase().charAt(0) + " as in " + getBaseCaseValue(name.toUpperCase().charAt(0));
		} else {
			return name.toUpperCase().charAt(0) + " as in " + name + "\n" + weWereOnABreak(name.substring(1));
		}
	}
	private static String getBaseCaseValue(char c) {
		int index = (int) c - (int) 'A';
		return bases[index];
	}
}
