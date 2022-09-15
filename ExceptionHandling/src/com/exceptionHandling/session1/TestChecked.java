package com.exceptionHandling.session1;

import java.io.FileNotFoundException;
import java.io.IOException;

public class TestChecked {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyCheckedException obj = new MyCheckedException();
		try {
			obj.demoFile();
		} catch (FileNotFoundException e) {
			System.out.println(e);
			e.printStackTrace();
		}catch(IOException i) {
			System.out.println(i);
		}

	}

}
