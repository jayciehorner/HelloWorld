package com.skillstorm.training.week09.day2.multithreading;

public class MultithreadingExample {
	public static void main(String[] args) throws InterruptedException {
		Universe u = Universe.getInstance();

		Thread t1 = new Thread(() -> {
			System.out.println("t1");
			for (int i = 0; i < 10; i++) {
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
				}
				u.add();
			}
		});

		Thread t2 = new Thread(() -> {
			System.out.println("t2");
			for (int i = 0; i < 10; i++) {
				try {
					Thread.sleep(90);
				} catch (InterruptedException e) {
				}
				u.add();
			}
		});

		t1.start();
		t2.start();

		t1.join();
		t2.join(); // This tells the main thread to wait for t1 before continuing

		System.out.println("main");
	}

}
/*
 * Add thread safety in one of three ways
 * 1. make the read and update methods synchronized, 
 *   so no one can read a value while someone else is updating it -- degrades performance
 * 1b. make the specific code statement(s) in the method that need to be thread-safe synchronized
 * 2. make the property being read/updated volatile so the most recent value is always read
 * 3. use an atomic data type for the property being read/updated
 *     Example: AtomicInteger in the java.util.concurrent.atomic package 
 */
class Universe {
	private int numSolarSystems;
	private volatile static Universe instance;

	private static Object keyToTheUniverse = new Object(); // Mutex acts like a lock
	
	private Universe() {
	}

	public static Universe getInstance() {
		// only run new Universe once
		if (instance == null)
			synchronized (keyToTheUniverse) {
				instance = new Universe();
			}
		return instance;
	}

	public int getNumSolarSystems() {
		return numSolarSystems;
	}

	public void add() {
		numSolarSystems++;
	}

	@Override
	public String toString() {
		return "Universe [numSolarSystems=" + numSolarSystems + "]";

	}

}