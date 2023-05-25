package com.skillstorm.training.week08.day3;

import java.io.*;

public class FindLongestWords {
	public static void main(String[] args) throws IOException {
		// TODO Challenge
		// Find the longest word in the words_alpha.txt

		// Problem 1:
		// How many letters does the longest word have?
		howManyLetters();

		// Bonus 1:
		// What is the longest word?
		longestWord();

		// Bonus 2:
		// Write the longest word(s) to a file
		writeLongestWords();
	}
public static int howManyLetters() {
	String longest = "";
	String newLongest;
	try (BufferedReader in = new BufferedReader(new FileReader(new File("words_alpha.txt")))) {
		String s;
		while ((s = in.readLine()) != null) {
			newLongest = s;
			if (s.length() > longest.length()) {
				longest = newLongest;

			}
		}
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
	System.out.println("The longest word in this file is " + longest.length() + " characters long.");
	return longest.length();


}
	public static String longestWord() throws IOException {
		String longest = "";
		String newLongest;
		try (BufferedReader in = new BufferedReader(new FileReader(new File("words_alpha.txt")))) {
			String s;
			while ((s = in.readLine()) != null) {
				newLongest = s;
				if (s.length() > longest.length()) {
					longest = newLongest;

				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("The longest word in this file is '" + longest + "'.");
		return longest;

	}
	public static void writeLongestWords() throws FileNotFoundException, IOException {
		// file located at root level moby-dick.txt
		String longest = "";
		String newLongest;
		try (BufferedReader in = new BufferedReader(
				new FileReader(new File("words_alpha.txt")));
				BufferedWriter out = new BufferedWriter(
						new FileWriter(new File("longestWords.txt")))) {
			String s;
			while ((s = in.readLine()) != null) {
				newLongest = s;
				if (s.length() > longest.length()) {
					longest = newLongest;
					if(longest.length() >= 20) {
						out.write(s);;
						out.newLine();
					}
				}
			}
		}
		System.out.println("Any words greater than or equal to twenty characters found within words_alpha.txt have been written into a new file called longestWords.txt");

	}

	
}
