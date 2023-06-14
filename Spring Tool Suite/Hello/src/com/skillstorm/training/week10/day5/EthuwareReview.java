package com.skillstorm.training.week10.day5;

public class EthuwareReview {
	public static void main(String[] args) throws Throwable {
//		throw new String("No that didn't work"); // ,ust be an object of type of subclass of Throwable
//		throw newThrowable();
//		throw newError();
//		throw new RuntimeException();

		try {
			RuntimeException re = null; // if we try and call a method on this object, NullPointerException
//		Throw re; // compiler does type checking, not looking at the values
			// so no compilation error
			throw new NullPointerException("some message here");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
