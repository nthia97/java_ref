//convert an arraylist into array
import java.util.*;
class ArrayListToArray{
	public static void main(String[] args) {
		//create an array list
		ArrayList<Integer> al=new ArrayList<Integer>();

		//add elements to the arrayList
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);

		//display contents of the arraylist
		System.out.println(al);

		//get the array
		Integer	ia[]=new Integer[al.size()];
		ia=al.toArray(ia);

		int sum=0;
		//sum the array
		for(int a:ia)
			sum+=a;

		System.out.println("Sum is :"+sum);
	}
}