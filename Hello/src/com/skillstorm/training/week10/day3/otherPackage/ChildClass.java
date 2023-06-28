package com.skillstorm.training.week10.day3.otherPackage;

import com.skillstorm.training.week10.day3.myPackage.MyClass;

public class ChildClass extends MyClass {
//	public String toString() {
//		return "a = " + a + " b = " + b + " c = " + c + " d = " + d; // package AND private not inherited
//	}
	public static void main(String[] args) {
		MyClass mc = new MyClass();
		System.out.println("a = " + mc.a);
//		System.out.println("b = " + mc.b);
//		System.out.println("c = " + mc.c);
//		System.out.println("d = " + mc.d);
	}

	public void print() {
		MyClass mc = new MyClass();
		System.out.println("a = " + mc.a);
//		System.out.println("b = " + mc.b);
		
		System.out.println("a = " + this.a);
		System.out.println("b = " + this.b); // field is accessed using inheritance
		// System.out.println("c = " + mc.c);
//		System.out.println("d = " + mc.d); 	// private fields are not inherited

	}
	public static boolean compare(MyClass o1, MyClass o2) {
		if (o1.a != o1.a)
			return false;
//		if (o1.b != o1.b) // parent type not accessible
//			return false;
//		if (o1.c != o1.c)
//			return false;
//		if (o1.d != o1.d)
//			return false;
		return false;
	}
}

