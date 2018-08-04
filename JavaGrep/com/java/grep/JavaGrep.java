package com.java.grep;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class JavaGrep {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter input file path and name:");
		String inFile = scanner.nextLine();
		System.out.println("You entered: " + inFile);
		
		
		File file = new File(inFile);
		System.out.print("Enter string you want to search:");
		String string = scanner.nextLine();
		int lineCount=0;
		int flag=0;
		
		BufferedReader br=new BufferedReader(new FileReader(inFile));
		String line;
		
		//logic to count the line numbers 
		while((line=br.readLine())!=null)
		{
			
			lineCount++;
			if(line.contains(string))
			{
				flag = 1;
				System.out.println("Line number "+lineCount+" Line: "+line);
			}
		}
		if(flag!=1)
			System.out.println("the string is not present in the file ");
				
		
	}

}
