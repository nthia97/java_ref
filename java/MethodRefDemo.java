//Demostrate a method reference for a static method
	interface StringFunc{
		String func(String n);
		}
		//This method class defines a static method named strReverse()
		class MyStringOp{
			static String strReverse(String str){
				String result="";
				for(int i=str.length()-1;i>=0;i--)
						result+=str.charAt(i);

				return result;
			}
		}
		class MethodRefDemo{
			//This method has a type interface as its first parameter
			//Thus,it can be passed any instance of that of that interface including
			// a reference.
			static String stringOp(StringFunc fs,String s){
				return fs.func(s);
			}
			public static void main(String[] args) {
				String inStr="Lambdas add power to java";
				String outStr;

				//Here a method reference to strReverse is passed to stringOp
				outStr=stringOp(MyStringOp::strReverse,inStr);

				System.out.println("Original string: "+inStr);
				System.out.println("Reversed string: "+outStr);

			}
		}
