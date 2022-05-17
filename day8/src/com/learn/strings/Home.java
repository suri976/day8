package com.learn.strings;

public class Home {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    NewStrings s=new NewStrings();
    NewStrings x=s;
    String p="sai";
    StringBuffer c=new StringBuffer("Sai");
    System.out.println(p.hashCode());
    System.out.println(c.hashCode());
    System.out.println(c.capacity());
    
    
   /* System.out.println(s);
    System.out.println(s.x);
    System.out.println(s.y);
    System.out.println(s.hashCode());
    System.out.println(x.hashCode());
    //StringBuilder g;
    */
    
		
		
		
	}

}
