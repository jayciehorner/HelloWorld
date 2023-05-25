package com.skillstorm.training.week08;
@FunctionalInterface // This allows me to use a lambda instead of an instance of a class that implements this interface
	public interface Action {
		
		void act();

	}

	class DoNothing implements Action {
		public void act() { System.out.println("Not doing anything"); }
	}

	// Example:
	// () -> System.out.println("Not doing anything");

	class Repeater implements Action {
		public void act() {
			String str = "dun-dun-dun ";
			for (int i = 0; i < 10; i++) { // these only work at the end of a line of code
				/* This is a comment in the front of the line*/System.out.print(str);
			}
		}
	}

	// example :
	/*
	() -> {

	   String str = "dun-dun-dun ";

	   for (int i = 0; i < 10; i++) {
		   System.out.print(str);
	   }

	}
	*/


