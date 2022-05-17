package com.learn.strings;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		
		
		String str, rev = "";
	      Scanner sc = new Scanner(System.in);
	 
	      System.out.println("Enter a string:");
	      str = sc.nextLine();
	 
	      int length = str.length();
	 
	      for ( int i = length - 1; i >= 0; i-- )
	         rev = rev + str.charAt(i);
	 
	      if (str.equals(rev))
	         System.out.println(str+" is a palindrome");
	      else
	         System.out.println(str+" is not a palindrome");
	      
	      
	      
	      
	      System.out.print("Original word: ");
	      System.out.println(str); //Example word
	      char ch;
	      String s="";
	       
	      for (int i=0; i<str.length(); i++)
	      {
	        ch= str.charAt(i); //extracts each character
	        s= ch+s; //adds each character in front of the existing string
	      }
	      System.out.println("Reversed word: "+ s);
	      sc.close();
		
		
	}

}
