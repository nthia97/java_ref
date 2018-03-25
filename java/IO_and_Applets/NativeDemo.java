// A simple example that uses native method
public class NativeDemo{
  int i;
  public static void main(String[] args) {
    NativeDemo ob = new NativeDemo();

    ob.i=10;
    System.out.println("This is ob.i before native method: "+ob.i);

    ob.test();  //call a native
    System.out.println("This is ob.i after native method: "+ob.i);
  }
// declare a native method
public native void test();
//load DLL that contains the static method
static{
  System.loadLibrary("NativeDemo");
}
}
