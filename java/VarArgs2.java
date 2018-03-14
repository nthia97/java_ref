// Use varargs with standard arguments.
class VarArgs2 {
	// Here, msg is a normal parameter and v is a
	// Varargs parameter.
	
	static void vaTest(String msg, int ...v)
	{
		System.out.print(msg + v.length + " Contents: ");

		for(int x:v)
			System.out.print(x + " ");

		System.out.println();
	}
	public static void main(String args[])
	{
		vaTest("one vararg: ",10);
		vaTest("Three varargs: ",1,2,3);
		vaTest("No varargs: ");
	}
}
