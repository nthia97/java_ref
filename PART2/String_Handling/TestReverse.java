import java.util.*;
class TestReverse {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);

		String str=in.nextLine();
		StringBuffer s =new StringBuffer(str);

		s.reverse();
		System.out.println(s);
	}
}
