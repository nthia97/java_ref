/*
 * CompareTo.java
 * 
 * Copyright 2018 Paul Mburu <paulmburu53@gmail.com>
 * 
 *  a compareTo practice
 * 
 */


public class CompareTo {
	
	public static void main (String args[]) {
		int vals[]={1,2,3,4,5};
		
		int x=vals[0];
		
		for(int i=0;i<vals.length;i++){
		if(vals[i].compareTo(x)>0) x=vals[i];
		
		System.out.println(x);
		}
		
		
	}
}

