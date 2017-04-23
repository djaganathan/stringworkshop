package com.dhana.stringworkshop;

public class ReverseString {

	public static void main(String[] args) {
		String src = "Dhana jenkins";
		System.out.println(reverse(src));
	}
	
	public static String reverse(String input) {
		int inputLength = input.length();
		char[] src = new char[inputLength];
		char[] rev = new char[inputLength];
		input.getChars(0, inputLength, src, 0);
		
		for(int i=0,j=inputLength-1; j>=0;j--,i++){
			rev[i] = src[j];
		}
		return new String(rev);
	}

}
