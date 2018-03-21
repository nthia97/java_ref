/*
 * AutoBox.java
 * 
 * Copyright 2018 Paul Mburu <paulmburu53@gmail.com>
 * 
 * Demonstrate Autoboxing and Unboxing
 * 
 */


public class AutoBox {
	
	public static void main (String args[]) {
		int iob=100; //autobox an int
		
		int i=iob; //auto-unbox 
		System.out.println(i+" "+iob);  //displays 100 100
	}
}

