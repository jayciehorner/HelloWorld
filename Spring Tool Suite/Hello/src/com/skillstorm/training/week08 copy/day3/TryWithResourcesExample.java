package com.skillstorm.training.week08.day3;
import java.util.Scanner;
public class TryWithResourcesExample {
	public static void main(String[] args) throws Exception {
		// try-with-resources blocks 
		//  -- can be used instead of try-catch-finally to close resources
		//  -- can only be used with objects that implement AutoCloseable
		//  -- Java calls the close methods for us, in the opposite order the objects were created
		//  -- catch and finally blocks run AFTER the close methods are called
		try (Scanner in = new Scanner(System.in); // 
				Stuff2 s = new Stuff2();
				MoreStuff s2 = new MoreStuff()) { // 
			throw new NullPointerException();
		} catch (Exception e) {
			System.out.println("Something went wrong");
//			s.close(); // s has already been closed
		} finally {
//			s.close(); // s has already been closed
		}
	}
}


class Stuff2 implements AutoCloseable {
	
	@Override
	public void close() throws Exception {
		System.out.println("Closing the stuff");
		
	}
	
}

class MoreStuff implements AutoCloseable {
	
	@Override
	public void close() throws Exception {
		System.out.println("Closing the more stuff");
		
	}
	
}
