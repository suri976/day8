package com.learn.strings;

import java.util.Scanner;

public class Sub {

	public static void main(String[] args) {
		
		
		Scanner n = new Scanner(System.in);
		System.out.println("Enter your string");
		String m=n.nextLine();
		System.out.println("Enter sub string");
		String p=n.nextLine();
		
        boolean x=m.contains(p);
        if(x)
        	System.out.println("Entered sub string is present");
        else
        	System.out.println("Entered sub string is not present");
        	n.close();
        
       
	}

}
