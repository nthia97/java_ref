// NonGen is functionality equal to gen
// but not use Generics
class NonGen{
  Object ob;  // ob is now of type Object

  // Pass the constructor a reference to
  // an object of type Object
  NonGen(Object o){
    ob=o;
  }
  // Return type Object.
  Object getOb(){
    return ob;
  }
  // Show type of ob.
  void showType(){
    System.out.println("Type of ob is: "+ob.getClass().getName());
  }
}
  // Demonstrate the non-generic class.
  class NonGenDemo{
    public static void main(String[] args) {
      NonGen iOb;

      // Create NonGen Object and store
      // an Integer in it. Autoboxing still occurs.
      iOb= new NonGen(88);
      // Show the type of data used by iOb.
      iOb.showType();
      int v=(Integer)iOb.getOb();
      System.out.println("Value: "+v);

      System.out.println();

      // Create another NonGen object and
      // store a String in it.
      NonGen strOb= new NonGen("Non-Generic test");
      // Show the type of data used by strOb.
      strOb.showType();
      // Get the value of strOb.
      // Again, notice that a cast is necessary.
      String str=(String)strOb.getOb();
      System.out.println("Value: "+str);
      // This compiles, but is conceptually wrong!
      iOb=strOb;
      v=(Integer)iOb.getOb(); //run-time error!
    }
  }
