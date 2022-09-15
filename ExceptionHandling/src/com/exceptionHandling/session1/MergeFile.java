package com.exceptionHandling.session1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

public class MergeFile {
	public void mergeFiles() {
		try {
			PrintWriter pw = new PrintWriter("C:\\Users\\Saumya.Prabhakar\\Documents\\Folder\\output.txt");
			BufferedReader br1 = new BufferedReader(new FileReader("C:\\Users\\Saumya.Prabhakar\\Documents\\Folder\\text1.txt"));
			BufferedReader br2 = new BufferedReader(new FileReader("C:\\Users\\Saumya.Prabhakar\\Documents\\Folder\\text2.txt"));


			while(true) {
				int line1 = br1.read();
				int line2 = br2.read();
				if(line1 == -1 && line2 == -1) {
					break;
				}
				pw.print((char)line1);
				pw.print((char)line2);;			

			}
			br1.close();
			br2.close();
			pw.close();
			System.out.println("Merged alternate contents!");

		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
