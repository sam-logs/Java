package com.exceptionHandling.session2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionsCombo {
	public void exceptions() {
		try {
			//System.out.println(4 / 0);
//			String word = null;
//			System.out.println(word.charAt(1));
			FileInputStream fin = new FileInputStream("C:\\student.txt");
			

		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException :divide by 0");
		} catch(NullPointerException n) {
			System.out.println("NullPointerException: string is empty");
		} catch(FileNotFoundException f) {
			System.out.println("NullPointerException: folder empty");
		}

	}
}