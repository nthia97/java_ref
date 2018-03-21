/*
 * Wrap.java
 * 
 * 2018 Paul Mburu <paulmburu53@gmail.com>
 * 
 * Demonstrate a type wrapper
 * 
 * 
 */


public class Wrap {
	
	public static void main (String args[]) {
		Integer iob= new Integer(100);  //boxing 
		
		int i=iob.intValue();  //unboxing
		
		System.out.println(i+" "+iob); //displays 	100 100
	}
}

