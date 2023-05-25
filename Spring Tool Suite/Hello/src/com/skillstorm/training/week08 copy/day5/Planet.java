package com.skillstorm.training.week08.day5;

public enum Planet {
	
	MERCURY(0.38),
	VENUS(0.91), 
	EARTH(1),
	MARS(0.38),
	JUPITER(2.34),
	SATURN(1.06),
	URANUS(0.92),
	NEPTUNE(1.19),
	PLUTO(0.06);
	
	private Planet(double d) {
		this.gravityMultiple = d;
	}
	private double gravityMultiple; // compared to earth's gravity
	
	double getGravityMultiple() {
		return this.gravityMultiple;
	}
}
class Person {
	String name;
	double weight;
	public Person(String name, double weight) {
		this.name = name;
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", weight=" + weight + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getWeight(Planet planet) {
		return this.weight * planet.getGravityMultiple();
	}
	
}