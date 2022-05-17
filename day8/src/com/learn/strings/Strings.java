package com.learn.strings;

public class Strings {
	public static void main(String[] args) {
		
		
		
		StringBuffer s= new StringBuffer("Wonderful");
		System.out.println(s);
		System.out.println(s.capacity());
		System.out.println(s.append(" Things like"));
		
		System.out.println(s.capacity());
		
		
		System.out.println("substring is : "+s.substring(0, 9));
		
		System.out.println(s);
		System.out.println(s.append(" plants"));
		System.out.println("Before Trimming  The capacity is "+s.capacity());
		
		s.trimToSize();
		System.out.println("Before Trimming  The capacity is "+s.capacity());
		System.out.println(s);
		
		
		System.out.println("the index of like is "+s.indexOf("like"));	
		System.out.println(s.replace(0, 9,"Amazing"));
		System.out.println();
		
		StringBuilder s2= new StringBuilder("Get control over your Mind");
		System.out.println(s2);
		System.out.println("the length is "+s2.length());
		System.out.println("Capacity is "+s2.capacity());
		System.out.println(s2.append(" and emotions"));
		System.out.println(s2.capacity());
		
		
		s2.trimToSize();
		
		System.out.println(s2.capacity());
		System.out.println(s2);
		System.out.println(s2.length());
		
		
		//String 
	}

}
