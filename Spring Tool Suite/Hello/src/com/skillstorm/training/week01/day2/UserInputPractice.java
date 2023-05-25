package com.skillstorm.training.week01.day2;
//Note: package statement has to be at the top

//Right below that is our import statements
//Java doesn't automatically load all the java library classes, 
//only the ones we tell it we need
import java.util.Scanner;

public class UserInputPractice {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter your name: ");
		
		String name = in.nextLine(); // this will grab everything up to the first newline character
		in.close(); // REMEMBER to close your scanner resource (Java Garbage collection does not automatically do this)
		System.out.println("Hello, " + name + "!");
	}

}