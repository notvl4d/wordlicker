package com.myapp.io;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner; 
public class ReadFile {
	  public static String[] outputfile(String filename) {
		ArrayList<String> fileContent = new ArrayList<>();
	    File myObj = new File(filename);				
	    try (Scanner myReader = new Scanner(myObj)) {
	      while (myReader.hasNextLine()) {				//prints every line
	        String data = myReader.nextLine();	
	        fileContent.add(data);
	      }
	    } catch (FileNotFoundException e) {
	      System.out.println("An error occurred.");
	      return null;
	    }
	    return fileContent.toArray(new String[0]);
	    
	  }
	}