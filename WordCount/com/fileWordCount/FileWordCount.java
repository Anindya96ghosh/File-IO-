//to count the words present in the file

package com.fileWordCount;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileWordCount {

	public static void main(String[] args) throws FileNotFoundException {

		
		Scanner scanner = new Scanner(System.in);
		scanner.useDelimiter(" ");
		System.out.print("Enter input file path and name:");
		String inFile = scanner.nextLine();
		System.out.println("You entered: " + inFile);
		
		File file = new File(inFile);
		
		try(Scanner sc=new Scanner(file))
		{
			int count=0;
			while(sc.hasNext())
			{
				sc.next();
				count++;
			}
			System.out.println("Number of words: "+count);
		}
		
		
	}

}
