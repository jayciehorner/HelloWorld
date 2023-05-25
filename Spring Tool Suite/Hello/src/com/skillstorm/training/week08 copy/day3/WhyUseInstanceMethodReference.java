package com.skillstorm.training.week08.day3;

import java.util.Arrays;
import java.util.List;

public class WhyUseInstanceMethodReference {
	public static void main(String[] args) {
		// Example 4:
		List<Cat> cats = Arrays.asList(
				new Cat("Boots"),
				new Cat("Pumpkin"),
				new GrumpyCat("Thunder"),
				new GrumpyCat("Fluffy"),
				new Cat("Stevie"),
				new Cat("Momo"),
				new GrumpyCat("Garfield")
				);
		for (Cat cat : cats) {
			petCat(cat::greet); // lambda notation equivalent here is petCat(cat -> cat.greet());
		}

	}

	public static void petCat(Greeter g) { // takes the functional interface as the "target type"
		System.out.println("You see a cat and go up to it. The cat responds with: ");
		g.greet();

	}

}

interface Greeter {
	void greet();
}

class Cat implements Greeter {
	String name;

	public Cat(String name) {
		this.name = name;
	}

	@Override
	public void greet() {
		System.out.println("Hello, I am " + name + " and I love chin scratches.");
	}
}

class GrumpyCat extends Cat {
	public GrumpyCat(String name) {
		super(name);
	}

	@Override
	public void greet() {
		System.out.println("Hello, I am " + name + " and I want to be left alone.");
	}
}