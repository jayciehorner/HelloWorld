package com.skillstorm.training.week08.day5;

import java.io.*;
import java.time.*;
import java.util.List;

public class DogTestReader {
	public static void main(String[] args) throws FileNotFoundException, IOException {

		Dog d = new Dog("test", LocalDate.now());
		System.out.println(d);

		List<Dog> dogs = Dog.read(new File("src/com/skillstorm/training/week08/dogs.csv"));
		System.out.println(dogs);

	}
}
