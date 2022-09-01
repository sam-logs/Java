package largestNumber;

import java.util.Scanner;

public class CheckPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String to check palindrome: ");
		String str = sc.nextLine();
		String revStr = "";
		int strLen = str.length();
		
		for(int i=strLen-1; i>=0;--i) {
			revStr= revStr+str.charAt(i);
		}
		if (str.toLowerCase().equals(revStr.toLowerCase())) {
		      System.out.println(str + " is a Palindrome String.");
		    }
		    else {
		      System.out.println(str + " is not a Palindrome String.");
		    }
		  }

	}


