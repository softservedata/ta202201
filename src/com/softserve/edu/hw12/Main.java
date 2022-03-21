package com.softserve.edu.hw12;

import java.io.*;

public class Main {

	public static void main(String[] args) {
	
		File file = new File("src/com/softserve/edu/hw12/file.txt");
		BufferedReader bufferedReader = null;
		FileWriter fileWriter = null;
		
		try {
			
			bufferedReader = new BufferedReader(new FileReader(file));
			
			String line = bufferedReader.readLine();
			System.out.println(line);
			
			String newLine = line.replace("Welcome", "Hello");
			System.out.println(newLine);
			
			fileWriter = new FileWriter(file);
			fileWriter.write(newLine);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bufferedReader.close();
				fileWriter.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
}
