
// A block lambda that computes the factorial of an int value.
interface NumericalFunc {
	int func(int n);
}
class BlockLambdaDemo{
	public static void main(String args[]){
		//This block lambda computes the factorial of an int value
		NumericalFunc factorial= (n) -> {
			int result =1;
			for(int i=1;i<=n;i++)
				result=i*result;

			return result;
		};

		System.out.println("The factorial of 3 is "+factorial.func(3));
		System.out.println("The factorial of 5 is "+factorial.func(5));
	}
}
