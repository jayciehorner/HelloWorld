package com.skillstorm.training.week08.day4;

import java.io.*;
import java.util.List;
import java.util.ArrayList;

public class Challenge {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// Create a custom Person class with a firstName, lastName, and dob (date of
		// birth)
		// write the data to a csv file

		// Bonus:
		// Read the data back from the file
		// Find the oldest person

		// Find the age range between the oldest and youngest person
		List<Person> people = new ArrayList<>();
		people.add(new Person("Smith", "Jay", "12/25/1963"));
		people.add(new Person("Smith", "Kimberly", "09/28/2005"));
		people.add(new Person("Smith", "Cayman", "02/03/1997"));
		people.add(new Person("Smith", "Jordan", "07/19/1995"));
		people.add(new Person("Smith", "Elaina", "11/01/2003"));
		people.add(new Person("Smith", "Lacie", "04/04/1968"));
		
	//	System.out.println(people);
		System.out.println(people);
		
		Person.save(people, new File("PII.csv"));

		List<Person> p = Person.readData(new File("PII.data"));
		people.forEach(System.out::println);

	}
}

class Person {
	String lastName;
	String firstName;
	String dob;

	public Person(String lastName, String firstName, String dob) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "Person [lastName=" + lastName + ", firstName=" + firstName + ", dob=" + dob + "]";
	}

	public static void save(List<Person> people, File file) throws IOException {
		try (ObjectOutputStream writer = new ObjectOutputStream(
				new BufferedOutputStream(new FileOutputStream(file, false)))) {
			for (Person p : people) {
				writer.writeObject(p);
			}

		}

	}

	public static List<Person> readData(File file) throws FileNotFoundException, IOException, ClassNotFoundException, NotSerializableException {
		List<Person> people = new ArrayList<>();
		try (ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)))) {
			while (true) {
				Object obj = in.readObject();
				if (obj instanceof Person)
					people.add((Person) obj);
			}
		} catch (EOFException e) {

		} 
		return people;
	}
}