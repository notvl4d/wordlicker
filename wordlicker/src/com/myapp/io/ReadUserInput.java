package com.myapp.io;
import java.util.Scanner; 
public class ReadUserInput {
	public static String askUser() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter file name:");
		String fileName = scanner.nextLine();
		return fileName;
	}
}
