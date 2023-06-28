package com.skillstorm.training.week09.day2.multithreading;

public class Example2 {
public static void main(String[] args) throws InterruptedException{
	Thread t1 = new Thread(() -> {
		System.out.println("t1");
		for (int i = 0; i < 30; i++) {
			System.out.print(i + " ");
			} 
			System.out.println();
		});

		Thread t2 = new Thread(() -> {
		System.out.println("t2");
		for (int i = 0; i < 20; i++) {
			System.out.print(i + " ");
		} 
		System.out.println();
	});
		
		t1.start();
		t2.start();

		t1.join();
		t2.join(); // This tells the main thread to wait for t1 before continuing

		System.out.println("main done");

}
}
