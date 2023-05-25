package com.skillstorm.training.week08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;


public class LambdaExamples {
	public static void main(String[] args) {
		// Use the built-in functional interfaces: Comparator
		
		ArrayList<String> names = new ArrayList<>(Arrays.asList("Joanna", "Samantha", "Eric"));
		// Anywhere a functional interface type is required, I can hand in a lambda
//		Comparator<String> myFirstLambda =
		names.sort( (o1, o2) -> o1.length() - o2.length() ); // not reusable definition of Comparator
		System.out.println(names);
		
		

		// I can use a lambda in place of the functional interface Action

		
		
		// Use the built-in functional interface Predicate to removeIf from an ArrayList
		
		
		
		// Use the built-in functional interface UnaryOperator to replaceAll 

	}


}
