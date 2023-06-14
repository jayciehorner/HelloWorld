package com.skillstorm.training.week10.day3.otherPackage;
import com.skillstorm.training.week10.day3.myPackage.MyClass;
public class OtherClass {
	public static void main(String[] args) {
		MyClass mc = new MyClass();
		System.out.println("a = " + mc.a);
//		System.out.println("b = " + mc.b);	//only public fields accessible from outside the package
//		System.out.println("c = " + mc.c);	//only public fields accessible from outside the package
//		System.out.println("d = " + mc.d);	//only public fields accessible from outside the package
	}
}
