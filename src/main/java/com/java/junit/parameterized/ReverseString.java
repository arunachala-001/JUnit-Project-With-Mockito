package com.java.junit.parameterized;

public class ReverseString {
	
	public String reverseString(String s1) {
		String s3 = "";
			int start =0; int last = s1.length()-1;
			for(int i=s1.length()-1; i>=0; i--) {
				if(s1.charAt(i) != ' ') {
					continue;
				} else {
					start = i+1;
					s3 = s3+reverse(s1, start, last);
					last = i-1;	
				}
			}
			s3 =s3+reverse(s1,0,last);
			return s3.stripTrailing();
			
		
	}
	
	
	public String reverse(String s1, int start, int last) {
		String s2 = "";
		for(int i=start; i<=last; i++) {
			s2 = s2+s1.charAt(i);
		}
		return s2 = s2+" ";
	}
}