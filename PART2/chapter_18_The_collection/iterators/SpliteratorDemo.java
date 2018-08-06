// A simple Spliterator demonstration.
import java.util.*;
class SpliteratorDemo {
	public static void main(String args[]) {
	// Create an array list for doubles.
	ArrayList<Double> vals = new ArrayList<>();
	// Add values to the array list.
	vals.add(1.0);
	vals.add(2.0);
	vals.add(3.0);
	vals.add(4.0);
	vals.add(5.0);

	//use tryAdvance to display contents of val.
	System.out.print("contents of vals:\n");
	Spliterator<Double> spltitr=vals.spliterator();
	while(spltitr.tryAdvance((n)->System.out.println(n)));
	System.out.println();
	

	//create a new list that contains squares
	spltitr=vals.spliterator();
	ArrayList<Double> sqrs=new ArrayList<Double>();
	while(spltitr.tryAdvance((n)-> sqrs.add(Math.sqrt(n))));
	System.out.println();

	//use forEachRemaining() to display contents of sqrs.
	System.out.print("contents of sqrs:\n");
	spltitr=sqrs.spliterator();
	spltitr.forEachRemaining((n)-> System.out.println(n));
	System.out.println();
	}
}