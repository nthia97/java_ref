// A simple mailing list example
import java.util.*;
class Address{
	private String name;
	private String street;
	private String city;
	private String state;
	private String code;

	Address(String n,String s,String c,String st,String co){
		name=n;
		street=s;
		city=c;
		state=st;
		code=co;
	}

	public String toString(){
		return name+"\n"+street+"\n"+city+" "+state+" "+code;
	}
}

class MailList{
	public static void main(String[] args) {
		LinkedList<Address> ml=new LinkedList<Address>();
		//addd elements to the linked list.
		ml.add(new Address("J.W. West", "11 Oak Ave","Urbana","IL","61801"));
		ml.add(new Address("Ralph Bakr","1142 Maple Lane","Mahomet","IL","61853"));

		//display the mailing list
		for(Address element:ml)
			System.out.println(element+"\n");

		System.out.println();
		

	}
}