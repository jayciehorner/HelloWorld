package com.skillstorm.training.week01.day2;
import java.util.Scanner;
public class MathFormulasPractice {
	public static void main(String[] args) {
		// Math in Java
		Scanner in = new Scanner(System.in);
		
		System.out.println("How much pizza do you want? (Give a whole number percent of the pie.)");
		int percent = in.nextInt();
//		double fraction = percent / 100; // int / int = int
//		double fraction = percent / 100.0; // int / double = double
		double fraction = (double) percent / 100;  // type cast takes precedence
		int slices = 8;
		System.out.println("Here are your " + (slices * fraction) + " slices of pizza.");
	}

}
