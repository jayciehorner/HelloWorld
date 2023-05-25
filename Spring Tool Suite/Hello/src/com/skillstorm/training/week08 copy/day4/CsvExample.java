package com.skillstorm.training.week08.day4;
import java.io.*;
import java.util.List;
import java.util.ArrayList;
//CSV = comma separated values
public class CsvExample {
	public static void main(String[] args) throws IOException{
		// Lets write a list of objects to a CSV file
		List<Car>cars = new ArrayList<>();
		cars.add(new Car(2016, "Toyota", "Tacoma"));
		cars.add(new Car(2014, "Nissan", "Sentra"));
		cars.add(new Car(2003, "Chevy", "Camero"));
		cars.add(new Car(1997, "Jeep", "Cherokee"));
		cars.add(new Car(2009, "Ford", "F150"));
		cars.add(new Car(2015, "Chevy", "Equinox"));
		save(cars, new File("cars.data"));

		// Lets read the data from a CSV file and convert it to a list
	}
	public static void save(List<Car> cars, File file) throws IOException{ // Path from java.io is a newer version of file
		try(BufferedWriter writer = new BufferedWriter(
										new FileWriter(file, true))){ // append if file already exists
//			writer.write("year, make, model");
//			writer.newLine();
			for (Car car : cars) {
				writer.write(car.csvFormat());
				writer.newLine();
			}
		}
	}
}
// Custom class of cars
class Car implements Serializable{
	private int year;
	private String make;
	private String model;
	public Car() {
		super();
	}
	public Car(int year, String make, String model) {
		super();
		this.year = year;
		this.make = make;
		this.model = model;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		if (year < 1900)
			throw new IllegalArgumentException("Year cannot be older than 1900");
		this.year = year;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	@Override
	public String toString() {
		return "Car [year=" + year + ", make=" + make + ", model=" + model + "]";
	}
	public String csvFormat() {
		return year + ", " + make + ", " + model;
	}

}