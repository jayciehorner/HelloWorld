package com.skillstorm.training.week08.day3;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WhaleCounter {
public static void main(String[] args) throws IOException {
		
//		String test = "whales whale- whaler?.\"\" narwhale,";
//		String result = test.replaceAll("\\p{Punct}", " ");
//		System.out.println(result);
//		System.out.println(result.length());
//		String[] strs = result.split("\\s+");
//		System.out.println(strs.length);
//		System.out.println(Arrays.asList(strs));
		
		int count = countWhales();
		System.out.println("The novel Moby Dick has " + count + " occurences of the word whale.");
	}

	public static int countWhales() throws IOException {
		int count = 0;
		// file located at root level moby-dick.txt
		try (BufferedReader in = new BufferedReader(new FileReader(new File("moby-dick.txt")));
				BufferedWriter out = new BufferedWriter(new FileWriter(new File("whalesv2.txt")))) {
			
			String s;
			while ((s = in.readLine()) != null) {
//				String[] strs = s.replaceAll("[\\p{Punct}[’“—”]]", " ").split("\\s+");
				String[] strs = s.split("[^\\w]");
				for (String word : strs) {
					if (word.toLowerCase().contains("whale")) {
						count++;
						out.write(word);
						out.newLine();
					}
				}
			}
			
		}
		return count;
	}
}
