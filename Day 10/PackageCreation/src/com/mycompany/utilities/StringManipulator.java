package com.mycompany.utilities;

import java.util.Scanner;

public class StringManipulator {
	public static String reverseString(String input) {
	  char a[]=input.toCharArray();
	  String e="";
	  for(int i=a.length-1;i>=0;i--) {
		  e+=a[i];
	  }
	  return e;
	}
	public static boolean isPalindrome(String input) {
		if(reverseString(input).equalsIgnoreCase(input)) {
			return true;
		}
		return false;
	
	}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
     System.out.println(reverseString(s));
     System.out.println(isPalindrome(s));

	}

}
