package com.skillstorm.training.week01.day2;
import java.util.Scanner;
public class ScannerPractice {
	public static void main(String[] args) {
		
		//-------------------------------------------------------------------
		// UNCOMMENT TO RUN CODE
		//-------------------------------------------------------------------
		// Math.pow Example
//				int x = 2;
//				int n = 8;
//		  	float result = x ^ n; // Java does not have an exponent operator
//				double result = Math.pow(x, n); // gives us x^n
//				System.out.println(result);
		//--------------------------------------------------------------------	
				
				
		//------------------------------------------------------------------------
		// Compound Interest Example
//				// Order of operations: A = P(1 + r/n)nt
//				// We want result = principle * (1 + rate / numTermsPerYear)^(n*t)
//				float principle = 1000;
//				float rate = 5 / 100.0f; // be careful of integer division
//				int numTermsPerYear = 12;
//				float timeInDecimalYears = 2;
		//
//				// For debugging purposes, print out intermediate values (or rt click the line number, Toggle Breakpoint, and run in debug mode)
//				System.out.println(rate / numTermsPerYear);
//				System.out.println(Math.pow(  (1 + rate / numTermsPerYear),   numTermsPerYear * timeInDecimalYears   ));
		//
//				result = (double) principle * Math.pow((1 + rate / numTermsPerYear), numTermsPerYear * timeInDecimalYears);
//				System.out.println(result);
		//-------------------------------------------------------------------------
				
				
				
		//----------------------------------------------------------------------	
		// Scanner Examples:
//				// Scanners are a resource that need to be closed
				
				Scanner in = new Scanner(System.in);
//				//in.nextLine();
//				// Example 1: Double
//				System.out.println("Enter a price: ");
//				double price = in.nextDouble();
//				System.out.println("price=" + price);
//				
//				// Example 2: int
//				System.out.println("Enter a whole number: ");
//				int number = in.nextInt();
//				System.out.println("number=" + number);
		//------------------------------------------------------------------------		
				
				
		//------------------------------------------------------------------------------------------------
		// Challenge: Read an int and then a line to get a quantity and grocery item from the user
		//
//				System.out.println("Enter a quantity: ");
//				// TODO your code here
//						
//						
//				System.out.println("Enter a grocery item: ");
//				// TODO your code here
//						
//						
//				System.out.println("Here is your ..."); // TODO fix the print to display what they entered here
		//--------------------------------------------------------------------------------------------------
				
				
				
				
				
				
				
				
		//-------------------------------------------------
		// Challenge Solution 1: Read a int and then a line
//				System.out.println("Enter a quantity: ");
//				int qty = in.nextInt();
//				in.nextLine(); // clear the buffer
//				
//				
//				System.out.println("Enter a grocery item: ");
//				String item = in.nextLine(); // wait for the next user input
//				
//				
//				
//				System.out.println("Here is your " + qty + " " + item + "(s).");
		//--------------------------------------------------
				
				
		//-------------------------------------------------
		// Challenge Solution 2: Use .next() instead
//				System.out.println("Enter a quantity: ");
//				int quantity = in.nextInt();
//				// TODO your code here
//				
//				System.out.println("Enter a grocery item: ");
//				String groceryItem = in.next(); // wait for the next user input
//				
//				// TODO your code here
//				
//				System.out.println("Here is your " + quantity + " " + groceryItem + "(s).");
		//--------------------------------------------------

				
				
				//-------------------------------------------------
				// Example: Using .next() with a different delimiter to read in items
				
				// step 1: change the delimiter
				in.useDelimiter(", |\n|,"); // to use multiple delimiters separate by a pipe |

				// step 2: prompt user 
				System.out.print("Enter a list of 3 items (separated by commas): ");
				
				// step 3: read in user input
				String token1 = in.next();
				String token2 = in.next();
				String token3 = in.next();
				
				// step 4: print out the results
				System.out.println("Item 1: " + token1);
				System.out.println("Item 2: " + token2);
				System.out.println("Item 3: " + token3);
				//-------------------------------------------------
				
				in.close(); // Scanners are a resource that need to be closed (Java garbage collection won't clean up the memory allocated automatically)
			}
}
