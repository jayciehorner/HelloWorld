package com.skillstorm.training.week09.day2;

import java.util.Scanner;

public class FactoryExample {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("How many corners do you want the shape to have?");
		int corners = in.nextInt();
		// code here
		Shape shape = ShapeFactory.getShape(corners);
		System.out.println("Here is your " + shape);
		in.close();
	}

}

class ShapeFactory {
	// TODO add method to get shape based on number of corners
	public static Shape getShape(int corners) {
		switch (corners) {
		case 3: return new Triangle();
		case 4: return new Square();
		case 5: return new Pentagon();
		default: throw new IllegalArgumentException("Unknown shape with " + corners + " corners");
		}
	}
}

abstract class Shape {
	int corners;
	public Shape(int corners) { }
	public String toString() { return "Here is your shape with " + corners + " corners"; }
}

class Triangle extends Shape {
	public Triangle() { super(3); }
	public String toString() { return "Triangle"; }
}
class Square extends Shape { 
	public Square() { super(4); }
	public String toString() { return "Square";	}
}
class Pentagon extends Shape {

	public Pentagon() { super(5); }
	public String toString() { return "Pentagon";	}
}