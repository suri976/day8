package com.learn.strings;

public class NewString {

	public static void main(String[] args) {
		
		
		String s=new String("Paramesh is a good");
		System.out.println(s.charAt(9));
		System.out.println(s.toCharArray());
		  char []res=s.toCharArray();
		
		for(char p:res)
		{
			System.out.println(p);
		}
		
		String s1= new String("Paramesh is a good");
		System.out.println(s.indexOf("good"));
		System.out.println(s.lastIndexOf("good"));
		System.out.println(s.contentEquals(s1));
		
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
		System.out.println(s.equals(s1));
		
		// TODO Auto-generated method stub

	}

}
