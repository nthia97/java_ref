/*This program demonstrates the difference between
 * Public and private
 */
 
 class Test{
	 int a; //default access
	 public int b; //public access
	 private int c; //private access
	 
	 
	 //methods to access c
	 void setc(int i){//set c's value
		 c=i; 
	 }
	 
	 int getc(){ //get c's value
		 return c;
	 }
 }
	 class AccessTest{
		 public static void main(String args[]){
			 Test ob = new Test();
			 
			 //These are okay, a and b can be accessed directly
			 ob.a=10;
			 ob.b=20;
			 
			//This is not okay and will cause an error
			//ob.c=100; //ERROR
			
			//you must access c through its methods
			ob.setc(100); //OK
			System.out.println("a,b and c " + ob.a +" "+ ob.b+" "+ ob.getc());
		}
	}
			
			 
			 
			 
	 
	 
 
