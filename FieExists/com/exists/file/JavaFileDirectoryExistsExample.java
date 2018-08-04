//to accept the complete path of a file from the user and display whether the file exist or not.
package com.exists.file;

import java.io.File;

public class JavaFileDirectoryExistsExample
{
  public static void main(String[] args)
  {
	  // test to see if a the selected path is a directory
    File tmpDir = new File("C:\\Users\\acer\\Desktop\\Anindya");
    boolean exists = tmpDir.exists();
    if (exists)
    	System.out.println("C:\\Users\\acer\\Desktop\\Anindya exists");
    
    if (tmpDir.isDirectory())
    	System.out.println("C:\\Users\\acer\\Desktop\\Anindya is a directory");

    // test to see if a file exists
    File file = new File("C:\\Users\\acer\\Desktop\\Anindya\\sapatbuublesort\\.project");
    exists = file.exists();
    if (file.exists() && file.isFile())
    {
      System.out.println("C:\\Users\\acer\\Desktop\\Anindya\\sapatbuublesort\\.project file exists, and it is a file");
    }
    else
    {
    	System.out.println("file does not exists");
    }
  }
}