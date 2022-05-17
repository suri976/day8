package com.learn.strings;

public class LowertoUpper {
	
	public static void main(String[] args) {
		
		
		StringBuffer str= new StringBuffer("GET rid OF PRoblems");
		System.out.println(str);
		
		int ln = str.length();
        for (int i = 0; i < ln; i++) {
            Character c = str.charAt(i);
            if (Character.isLowerCase(c))
                str.replace(i, i + 1,Character.toUpperCase(c) + "");
            else
                str.replace(i, i + 1,Character.toLowerCase(c) + "");
        }
		
		System.out.println(str);
		//System.out.println(n.toLowerCase());
		
		
		// TODO Auto-generated method stub

	}

}
	
