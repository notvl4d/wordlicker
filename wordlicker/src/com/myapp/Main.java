package com.myapp;
import com.myapp.io.ReadFile;
import com.myapp.io.ReadUserInput;
public class Main {
    public static void main(String[] args) {
    	String fileName = ReadUserInput.askUser();
    	String[] file= ReadFile.outputfile(fileName);
    	if(file==null) {
    		return;
    	}
    	countCharacters(file);
    	countWords(file);
    	printFileContent(file);
    }
    public static void printFileContent(String[] lines) {
    	System.out.println("--- File contents ---");
    	int i=0;
    	while(i<lines.length && lines[i]!=null) {
    		System.out.println(lines[i++]);
    	}
    	System.out.println("--- End of file ---");
    }
    public static void countCharacters(String[] lines) {
    	int characterCount=0,i=0;
    	while(i<lines.length && lines[i]!=null) {
    		characterCount+=lines[i++].length();
    	}
    	System.out.println("Number of characters is: " + characterCount);
    }
    public static void countWords(String[] lines) {
    	int wordCount=0,i=0;
    	while(i<lines.length && lines[i]!=null) {
    		String[] words= lines[i++].trim().split("\\s+");
    		wordCount+= words.length;
    	}
    	System.out.println("Number of words is: " + wordCount);
    }
}
