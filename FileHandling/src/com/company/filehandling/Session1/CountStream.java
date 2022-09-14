package com.company.filehandling.Session1;

import java.io.BufferedReader;
import java.io.FileReader;

public class CountStream {
	public void countUpperCase() {
		try {
			BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Saumya.Prabhakar\\Documents\\Folder\\Student.txt"));
			String line = br.readLine();
			int upper = 0;
			for(int i = 0; i < line.length(); i++)
			{
				char ch = line.charAt(i);
				if(ch >= 'A' && ch <= 'Z')
					upper++;
			}
			System.out.println("Upper Case letters are:"+upper);


		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

	public void countLowerCase() {
		try {
			BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Saumya.Prabhakar\\Documents\\Folder\\Student.txt"));
			String line = br.readLine();
			int lower = 0;
			for(int i = 0; i < line.length(); i++)
			{
				char ch = line.charAt(i);
				if(ch >= 'a' && ch <= 'z')
					lower++;
			}
			System.out.println("Lower Case letters are: "+lower);


		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

	public void countDigits() {
		try {
			BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Saumya.Prabhakar\\Documents\\Folder\\Student.txt"));
			String line = br.readLine();
			int number = 0;
			for(int i = 0; i < line.length(); i++)
			{
				char ch = line.charAt(i);
				if(ch >= '0' && ch <= '9')
					number++;
			}
			System.out.println("Count of numbers are:"+number);


		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

	public void countVowels() {
		try {
			BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Saumya.Prabhakar\\Documents\\Folder\\Student.txt"));
			String line = br.readLine();
			int vowel = 0;
			for(int i = 0; i < line.length(); i++)
			{
				char ch = line.charAt(i);
				if(ch == 'A' || ch == 'a' || ch == 'E' || ch == 'e' || ch=='I' || ch=='i'|| ch=='O' || ch=='o' || ch=='U'
						|| ch == 'u')
					vowel++;
			}
			System.out.println("Count of vowels are:"+vowel);


		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}


