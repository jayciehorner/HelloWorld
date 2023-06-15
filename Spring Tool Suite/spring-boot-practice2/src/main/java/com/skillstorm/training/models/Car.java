package com.skillstorm.training.models;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Car {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "car_id")
	long id;
	String vin;
	String make;
	String model;
	int year;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getVin() {
		return vin;
	}
	public void setVin(String vin) {
		this.vin = vin;
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
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public Car(long id, String vin, String make, String model, int year) {
		super();
		this.id = id;
		this.vin = vin;
		this.make = make;
		this.model = model;
		this.year = year;
	}
	@Override
	public String toString() {
		return "Car [id=" + id + ", vin=" + vin + ", make=" + make + ", model=" + model + ", year=" + year + "]";
	}
	
	public Car() {
		this.id = 0;
	}
	
	
}
