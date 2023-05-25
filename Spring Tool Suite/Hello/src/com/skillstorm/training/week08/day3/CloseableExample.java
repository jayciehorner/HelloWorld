package com.skillstorm.training.week08.day3;

import java.util.Scanner;

public class CloseableExample {
	
//	try(Scanner in = new Scanner(System.in)){
//		Stuff s = new Stuff();) { 
//		in.nextLine();
//		throw new NullPointerException();
//		} catch (Exception e) {
//			System.out.println("Exception was thrown");
//		}
//	}
	
}

	// Try-with-resources blocks -- can only be used with objects that implement
	// AutoCloseable
	// instead of try-catch-finally
//	try(Scanner in = new Scanner(System.in)){
//				Stuff s = new Stuff();) { 
//				in.nextLine();
//				throw new NullPointerException();
//				} catch (Exception e) {
//					System.out.println("Exception was thrown");
//				}
//			}

	
	
	
	
	
	
	
	
	

class Stuff implements AutoCloseable {
	@Override
	public void close() throws Exception {
		System.out.println("Closing the stuff");
	}
}