package com.skillstorm.training.week09.day2;
/*
 * To make a Singleton, we need to do the following 3 steps:
 * 1. private static final instance of the class
 * 2. private constructor
 * 3. public static getInstance() method to obtain the object
 */
import java.util.List;
import java.util.ArrayList;
public class SingletonExample {
	public static void main(String[] args) {
		Universe u = Universe.getInstance();
		System.out.println(u);
		
		Universe u2 = Universe.getInstance();
		System.out.println(u2);
		
		System.out.println(u == u2);
	}

}

class Universe {
	public static void main(String[] args) {
		Universe u = getInstance();				// inside universe class I do not need to specify "Universe."
	}

	private int numSolarSystems;							  		// lazy initialization
	private static volatile Universe instance; // = new Universe();	// Where can I do this instead
	// atomic access = read and write must complete before another read and write can occur

	private Universe() {
	}

	public synchronized static final Universe getInstance() {
		// only run new Universe once
		if (instance == null)
			instance = new Universe();
		return instance;
	}

	public int getNumSolarSystems() {
		return numSolarSystems;
	}

	public void setNumSolarSystems(int numSolarSystems) {
		this.numSolarSystems = numSolarSystems;
	}

	@Override
	public String toString() {
		return "Universe [numSolarSystems=" + numSolarSystems + "]";
	}

}


