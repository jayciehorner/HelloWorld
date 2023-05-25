package com.skillstorm.training.week08.day3;
import java.io.*;
public class LineCounter {
	public static void main(String[] args) {
		int count = countWords("alice.txt");
		System.out.println(
				"There are " + count + " words in Alice and Wonderland");
	}

	public static int countLines(String path) {
		int count = 0;
		try (BufferedReader in = new BufferedReader(
									new FileReader(
										new File(path)))) {
			String s;
			while ((s = in.readLine()) != null) {
				count++;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return count;
	}
	
	// Split on the whitespace 
	public static int countWords(String path) {
		int count = 0;
		try (BufferedReader in = new BufferedReader(
									new FileReader(
										new File(path)))) {
			String s;
			while ((s = in.readLine()) != null) {
				// count how many words are in the string s
				// to do this, let's split the string on the whitespace
				String[] str = s.trim().split("\\w"); // this becomes \w which is a regular expression that matches all whitspace
				count += str.length;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return count;
	}
	
	
}
