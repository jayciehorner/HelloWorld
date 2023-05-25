package com.skillstorm.training.week08.day4;

import java.util.List;
import java.util.ArrayList;
import java.io.*;

public class ObjectDataExample {
	public static void main(String[] args) throws IOException, ClassNotFoundException{
List <Car> cars = readData(new File("cars.data"));
cars.forEach(System.out::println);
	}

	public static void save(List<Car> cars, File file) throws IOException {
		try (ObjectOutputStream writer = new ObjectOutputStream(
				new BufferedOutputStream(new FileOutputStream(file, false)))) {
			for (Car car : cars) {
				writer.writeObject(car);
			}
		}
	}
	public static List<Car> readData(File file) throws IOException, FileNotFoundException, ClassNotFoundException {
		List<Car> cars = new ArrayList<>();
		try(ObjectInputStream in = new ObjectInputStream(new BufferedInputStream( new FileInputStream(file)))){
			while (true) {
				Object obj = in.readObject();
				if (obj instanceof Car)
					cars.add((Car)obj);
			}
		} catch (EOFException e) {
	
		}
		return cars;
	}
}		
