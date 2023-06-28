package com.skillstorm.training.week10.day3;

public class ChangeTest {
	private int myValue = 0;

	public void showOne(int myValue) { // called with myValue = 100
		myValue = myValue; // what does this do? ****** local myValue is shadowing this.myValue
	} // this method has no value

	public void showTwo(int myValue) {
		this.myValue = myValue;
	}

	public static void main(String[] args) {
		ChangeTest ct = new ChangeTest(); // myValue = 0
		ct.showTwo(200); // myValue = 0
		System.out.println(ct.myValue);
		ct.showOne(100);
		System.out.println(ct.myValue);
	}
}
