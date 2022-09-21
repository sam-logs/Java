package com.exceptionHandling.session1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TestMerge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		MergeFile obj = new MergeFile();
//		obj.mergeFiles();
		System.err.println("error");
		try {
			BufferedWriter buffer = new BufferedWriter(new FileWriter("c:\\file.txt"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
