//to accept the complete path of a file from user and count the number of lines in that file and print it on the console.

package com.fileLineNumber;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.Scanner;

public class FileLineNumber {
	public static void main(String args[]) throws IOException
	{
		
		Scanner scanner = new Scanner(System.in);
		scanner.useDelimiter("\n");
		
		//accepting the path from the user
		System.out.print("Enter input file path and name:");
		String inFile = scanner.nextLine();
		System.out.println("You entered: " + inFile);           
		FileInputStream fs = new FileInputStream(inFile); 
		
	  	File file = new File(inFile);
	
	  	
		LineNumberReader lineNumberReader = new LineNumberReader(new FileReader(file));
	  	lineNumberReader.skip(Long.MAX_VALUE);
	  
	 	int lines = lineNumberReader.getLineNumber();
	  	lineNumberReader.close();

	  	System.out.println("total number of lines are "+ (lines+1));

	}
}
