package com.skillstorm.training.week10.day3.myPackage;

public class MyClass {
	public int a;
	protected int b;
	int c;
	private int d;

	public static void main(String[] args) {
		MyClass mc = new MyClass();
		System.out.println("a = " + mc.a);
		System.out.println("b = " + mc.b);
		System.out.println("c = " + mc.c);
		System.out.println("d = " + mc.d);
	}
}
