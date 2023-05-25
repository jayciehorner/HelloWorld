package com.skillstorm.training.week08.day3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class PalindromeFinder {

	public static void main(String[] args) throws FileNotFoundException, IOException {

//		System.out.println(reverse("hello"));
		findPalindromes();
	}

	public static void findPalindromes() throws FileNotFoundException, IOException {
		// file located at root level moby-dick.txt
		try (BufferedReader in = new BufferedReader(
				new FileReader(new File("words_alpha.txt")));
				BufferedWriter out = new BufferedWriter(
						new FileWriter(new File("palindromes.txt")))) {
			String s;
			while ((s = in.readLine()) != null) {
				if (isPalindrome(s)) {
					out.write(s);
					out.newLine();
				}
			}
		}

	}

	private static boolean isPalindrome(String str) {
		return str.equals(reverse(str));
	}

	private static String reverse(String str) {
		String result = "";
		// Create an array of characters
		char[] letters = str.toCharArray();
		for (int i = letters.length - 1; i >= 0; i--) {
			result += letters[i];
		}
		return result;
	}

}