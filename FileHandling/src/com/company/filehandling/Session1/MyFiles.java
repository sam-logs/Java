package com.company.filehandling.Session1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MyFiles {

	public void countWords() throws IOException {
		BufferedReader reader = null;

		int wordCount = 0;

		reader = new BufferedReader(new FileReader("C:\\Users\\Saumya.Prabhakar\\Documents\\Folder\\Student.txt"));

		String currentLine = reader.readLine();

		while (currentLine != null)
		{       
			String[] words = currentLine.split(" ");     
			wordCount = wordCount + words.length;  
			currentLine = reader.readLine();
		}


		System.out.println("Number Of Words In A File : "+wordCount);

		reader.close();
	} 

}
