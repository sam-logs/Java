package com.company.filehandling.Session1;

import java.io.File;

public class Count {
	public static int countFiles(File directory) {
		int count = 0;
		int countf = 0;
		for (File file : directory.listFiles()) {
			if (file.isFile()) {
				count++;
			}if (file.isDirectory()) {
				countf++;
			}
		}
		System.out.println("files are:"+count);
		System.out.println("folders are:"+countf);
		return count;
	}
}
