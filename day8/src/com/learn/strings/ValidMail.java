package com.learn.strings;
import java.util.*;
public class ValidMail {
	public static void main(String[] args) {
		
		
		System.out.println("Enter your password");
		Scanner b = new Scanner(System.in); 
	    System.out.println();

	    String mail = b.nextLine();  
	    
	    String mailid=mail.substring(0, 3);
	    String id2=mail.substring(1, mail.indexOf('@')+1);
	    
	    System.out.println(mail);

	    System.out.println(mailid);
	    System.out.println(id2);
	    
	    
	    boolean test=false;
	    for(char c:mail.toCharArray())
	    {
	    	if(c=='@' || c=='.') {
	    		test=true;
	    	}
	    	
	    	
	    }
	    if(test)
	    	System.out.println(mailid+" is an valid email");
	    else
	    	System.out.println(mailid+" is not  an valid email");
	    
	    
	    
	    
	    
	    
	    
	    
	    

	}
	

}
