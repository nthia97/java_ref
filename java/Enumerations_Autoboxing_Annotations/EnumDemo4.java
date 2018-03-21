/*
 * EnumDemo4.java
 * 
 *  2018 Paul Mburu <paulmburu53@gmail.com>
 * 
 * Demonstration fo ordinal(),compareTo() and equals()
 * 
 *  An enumeration of Apple varieties
 */

enum Apple {
	Jonathan, GoldenDel, RedDel, Winesap, Cortland
}

public class EnumDemo4 {
	
	public static void main (String args[]) {
		Apple ap, ap2, ap3;
		
		// obtain all ordinal values using ordinal()
		for(Apple a:Apple.values()){
			System.out.println(a+" "+a.ordinal());
			}
			
			ap =Apple.RedDel;
			ap2=Apple.GoldenDel;
			ap3=Apple.RedDel;
			
			System.out.println();
			
			// Demonstrate compareTo() and equals()
			if(ap.compareTo(ap2)<0)
				System.out.println(ap+" comes before "+ap2);
			if(ap.compareTo(ap2)>0)
				System.out.println(ap2+" comes before "+ap);
			if(ap.compareTo(ap3)==0)
				System.out.println(ap+ " equals "+ ap2);

			System.out.println();

			if(ap.equals(ap2))
				System.out.println("Error ");
			if(ap.equals(ap3))
				System.out.println(ap+" equals "+ap3);
			if(ap == ap3)
				System.out.println(ap+" == "+ap3);

	}
}

