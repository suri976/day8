package com.learn.strings;

import java.util.Scanner;

public class Password {

	
	
public static void main(String[] args) {
		
		
		System.out.println("Enter your password");
		Scanner b = new Scanner(System.in); 
	    System.out.println();

	    String password = b.nextLine();  
	    
	    String pword=password.substring(0, 3);
	    String id2=password.substring(1, password.indexOf('@')+1);
	    
	    System.out.println(password);

	    System.out.println(pword);
	    System.out.println(id2);
	    
	    
	    boolean test=false;
	    int x=password.length();
	    int c1=0;
	    
	    if(x>=8) {
	    	System.out.println();
	    	c1+=1;
	    }
	    
	    String n="123456789";
	    int c2=0;
	    
	    for(char c:password.toCharArray())
	    {
	    	if(c=='@' || c=='.') {
	    		test=true;
	    	}
	    	//if(c==n[c])
	    	
	    	
	    }
	    if(c1>2)
	    	System.out.println(pword+"Choosen password is good");
	    else
	    	System.out.println(pword+"Choosen password is weak");
	    
	
}
	
}
