package com.skillstorm.training.week08;

public class UsingLambdas {
	// Example 1: Using lambdas as a return type
		public static Incrementer<Integer> getIncrementer(int times) {
			return (x) -> x + times; // Why can I pass around functions like objects? 
			                         //  Java 8 wanted to allow functional programming so
			                         //  added lambdas that are "first class citizen" functions
		}
		
		

		public static void main(String[] args) {
			
			// Example 2: Storing lambdas in a variable
			Incrementer<Integer> inc2 = getIncrementer(2);
			Incrementer<Integer> inc10 = getIncrementer(10);
			Incrementer<Integer> inc100 = getIncrementer(100);
			Incrementer<Integer> inc5 = getIncrementer(5);
			
			// How do I use a lambda stored in a variable?
			//  Just like any other object with fields we can call!!! 
			for (int i = 0; i < 100; i = inc5.increment(i)) {
				System.out.println(i);
			}
		
		}

	}
	// Why do I need this definition of a functional interface?
	// - This is the type of the box that can hold the lambda
	// - Java is strongly typed, it needs to now what we are passing around (even though its just a bundle of code)
	@FunctionalInterface
	interface Incrementer<E extends Number> {
	E increment (int x);
}