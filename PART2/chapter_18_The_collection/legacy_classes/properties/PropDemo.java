// Demonstrate a property list 
import java.util.*;
class PropDemo{
	public static void main(String[] args) {
		Properties capitals=new Properties();
		capitals.put("Illinois", "Springfield");
		capitals.put("Missouri", "Jefferson City");
		capitals.put("Washington", "Olympia");
		capitals.put("California", "Sacramento");
		capitals.put("Indiana", "Indianapolis");

		// Get a set-view of keys
		Set<?> states=capitals.keySet();

		//show all of the states and capitals.
		for(Object name:states)
			System.out.println("The capital of "+ name +" is "+
				capitals.getProperty((String)name)+". ");

		System.out.println();

		// Look for state not in list -- specify default
		String str=capitals.getProperty("Florida","Not Found");
		System.out.println("The capital of Florinda is "+str+". ");
	}
}