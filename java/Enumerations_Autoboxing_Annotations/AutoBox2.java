// Autoboxing/unboxing takes place with
// method parameters and return values.

class AutoBox2 {
	// Take an integer parameter and return 
	// an int value
	
	static int m(Integer v){
		return v; // auto-unbox to int 
	}

	public static void main(String args[]){
		// Pass an int to m() and assing the return value 
		// to an integer. Here, the argument 100 is autoboxed
		// into an Integer. The return value is also autoboxed
		// into an Integer.

		Integer i0b= m(100);
		System.out.println(i0b);
	}
}
