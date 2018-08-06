//Demonstrate HashSet
import java.util.*;
class HashSetDemo {
	public static void main(String[] args) {
		//Create the hashset
		HashSet<String> hs=new HashSet<String>();

		//Add elements to the hashset
		hs.add("beta");
		hs.add("Alpha");
		hs.add("Eta");
		hs.add("Gamma");
		hs.add("Epsilon");
		hs.add("Omega");

		///print contents of the hashset
		System.out.println(hs);
	}
	
}
