package com.company.filehandling.Session1;

import java.io.*;

public class MergeFiles {
	@SuppressWarnings("resource")
	public void merge() {
		try {
			PrintWriter pw = new PrintWriter("C:\\Users\\Saumya.Prabhakar\\Documents\\Folder\\file3.txt");
			BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Saumya.Prabhakar\\Documents\\Folder\\file1.txt"));
			String line = br.readLine();
			
			while(line != null) {
				pw.println(line);
				line = br.readLine();
			}
			
			br = new BufferedReader(new FileReader("C:\\Users\\Saumya.Prabhakar\\Documents\\Folder\\file2.txt"));
			line = br.readLine();
			while(line != null) {
				pw.println(line);
				line = br.readLine();
			}
			
			System.out.println("Files merged Successfully");
			
			br.close();
			pw.close();
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
