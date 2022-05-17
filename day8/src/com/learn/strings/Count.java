package com.learn.strings;
import java.util.*;

public class Count {

	public static void main(String[] args) {
		
		Scanner n = new Scanner(System.in);
		System.out.println("Enter your string");
		String m=n.nextLine();
		
		int c=0;
		char d[]=m.toCharArray();
		//int l=m.length();
		//char h;
		
			Scanner g = new Scanner(System.in);
			char h=g.next().charAt(0);
			
		for(char k:d)
		{
			if(k==h)
				c++;
		}
			System.out.println("the count of "+h+" is "+c);	
			
			n.close();
			g.close();
		
		// TODO Auto-generated method stub

	}

}
