package com.skillstorm.training.week08.day3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MobyDick {
	public static void main(String[] args) {
//		int count = countWords("MobyDick.txt");
//		System.out.println("There are " + count + " words in Moby Dick");

		System.out.println("The word 'whale' is written " + countSpecificWord("MobyDick.txt", "whale") + " in Moby Dick");
	//	System.out.println(countWhales());
	}

	public static int countLines(String path) {
		int count = 0;
		try (BufferedReader in = new BufferedReader(new FileReader(new File(path)))) {
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
		try (BufferedReader in = new BufferedReader(new FileReader(new File(path)))) {
			String s;
			while ((s = in.readLine()) != null) {
				// count how many words are in the string s
				// to do this, let's split the string on the whitespace
				String[] str = s.trim().split("\\w"); // this becomes \w which is a regular expression that matches all
														// whitespace
				count += str.length;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return count;
	}

	public static int countSpecificWord(String path, String word) {
		int count = 0;
		try (BufferedReader in = new BufferedReader(new FileReader(new File(path)))){
			String s;
			while ((s = in.readLine()) != null) {
				String [] str = s.toLowerCase().split("[^\\w]");
				for(int i = 0; i < str.length; i++) {
				if (str[i].contains(word)) {
						count++;
					} //"[^\\w]"
				}
			}
		} catch (FileNotFoundException e){
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		return count;
	}
	public static int countWhales() throws IOException{
		int count = 0;
		//file located at root level moby-dick.txt
		try (BufferedReader in = new BufferedReader(new FileReader(new File("MobyDick.txt")));
				BufferedWriter out = new BufferedWriter(new FileWriter(new File("whales.txt")))) {
					String s;
					while ((s = in.readLine()) != null) {
						String [] strs = s.replaceAll("\\p{Punct}", " ").split("\\s+");
						for (String word : strs) {
							if(word.toLowerCase().contains(word))
							count++;
							out.write(word);
							out.newLine();
						}
					}
				}return count;
	}
} //int i = 0; i < str.length; i++
