package com.skillstorm.training.week08.day5;

public class StringBuilderPractice {
public static void main(String[] args) {
	System.out.println("ABCs holds: ");
	StringBuilder abcs = new StringBuilder("a");
	abcs.insert(0,  "b");
	abcs.insert(0,  "c");
	abcs.insert(1,  "d");
	abcs.insert(2,  "e");
	System.out.println(abcs);
}
}
