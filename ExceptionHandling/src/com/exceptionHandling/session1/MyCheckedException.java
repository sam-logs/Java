package com.exceptionHandling.session1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MyCheckedException {
	public void demoFile() throws FileNotFoundException, IOException {
		FileInputStream fin = new FileInputStream("C:\\Users\\Saumya.Prabhakar\\Documents\\Folder\\text2.txt");
		fin.read();
		int data = fin.read();
		while(data != -1) {
			
			data = fin.read();
		}
	}

}
