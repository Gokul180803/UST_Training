package com.mycompany.app;
import com.mycompany.utilities.StringManipulator;
public class Application {

	public static void main(String[] args) {
		
         String s="hello";
         System.out.println("Original String : "+s);
         System.out.println("Reverse String : "+StringManipulator.reverseString(s));
         String palindrome ="madam";
         String Nonpalindrome="world";
         boolean b=StringManipulator.isPalindrome(palindrome );
         boolean b1=StringManipulator.isPalindrome(Nonpalindrome);
         System.out.println(palindrome + " is palindrome? "+b);
         System.out.println(Nonpalindrome + " is Nonpalindrome? "+b1);
	}

}
