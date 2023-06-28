package com.skillstorm.training.week10.day4;

public class GroupWork {
public static int getUserID(String url) {
	return 0;  // TODO implemented by Team Apples
}
public static String getQueryParameterValue(String url, String key) {
	return null; // TODO implemented by Team Oranges
}
public static boolean isCSV(String filepath) { // numbers.csv or C://home/user/numbers.csv etc
	// don't want it to return true if the String filepath is ".csv"
	// don't want it to return true if someone named their text file data.csv.txt
	return filepath.endsWith(".csv");
}
}
