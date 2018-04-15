/*
 * Ascii.java
 * 
 * Copyright 2018 Paul Mburu <paulmburu53@gmail.com>
 * 
 */


public class Ascii {
	public static int NUMBER_LETTERS = 26;
	public static void main (String args[]) {
		
		char mychars[]={'h','e','l'};
		int[] charcounts=new int[NUMBER_LETTERS];
		for(int a:charcounts)System.out.println(a);
		for(int i=0;i<mychars.length;i++){
			char c=mychars[i];
			System.out.println(mychars[i]+" its ASCII is: "+(int)mychars[i]);
			int offset=(int)'a';
			int code=c-offset;
			System.out.println(code);
			
			charcounts[code]++;
			}
			
			System.out.println(charcounts.toString());
		
		
		
	}
}

