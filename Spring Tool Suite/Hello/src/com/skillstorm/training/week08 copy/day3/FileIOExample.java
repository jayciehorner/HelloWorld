package com.skillstorm.training.week08.day3;

import java.io.*;
import java.util.Scanner;

// File IO
// input/output
// options available: InputStream/OutputStream 
//					  BufferedInputStream/BufferedOutputStream
//					  FileReader/FileWriter -- for characters
//					  BufferedFileReader/BufferedFileWriter
//					  FileReader/FileWriter -- for characters
// 					  BufferedFileReader/BufferedFileWriter
public class FileIOExample {

	public static void main(String[] args) throws Exception {

// TODO read from a file and print to the console

		try (InputStream in = new FileInputStream(new File("example"))) {
			int b = in.read();
			while (b != -1) {
				System.out.print((char) b);
				b = in.read();
			}
		}
//		
//		try (InputStream moose = new FileInputStream(new File("SillyMoose"))){
//			int m = moose.read();
//			System.out.println(m);
//		}

		// TODO write the contents of a string array to a file
		try (FileWriter out = new FileWriter(new File("Fairy"))) {
			String[] fairy = {
					 "     .--.   _,\n"
					, "  .--;    \\ /(_\n"
					, " /    '.   |   '-._    . ' .\n"
					, "|       \\  \\    ,-.)  -= * =-\n"
					, " \\ /\\_   '. \\((` .(    '/. '\n"
					, "  )\\ /     \\ )\\  _/   _/\n"
					, " /  \\\\    .-'   '--. /_\\\n"
					, "|    \\\\_.' ,        \\/||\n"
					, "\\     \\_.-';,_) _)'\\ \\||\n"
					, " '.       /`\\   (   '._/\n"
					, "   `\\   .;  |  . '.\n"
					, "     ).'  )/|      \\\n"
					, "     `    ` |  \\|   |\n"
					, "             \\  |   |\n"
					, "              '.|   |\n"
					, "                 \\  '\\__\n"
					, "                  `-._  '. _\n"
					, "                     \\`;-.` `._\n"
					, "                      \\ \\ `'-._\\\n"
					, "                       \\ |\n"
					, "                        \\ )\n"
					, "                         \\_\\\n"
					
				   
					
					
			};
			for (String str : fairy) {
				out.write(str);
			}
		

		}

	}
}