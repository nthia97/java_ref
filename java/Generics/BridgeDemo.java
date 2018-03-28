// A situation that creates a bridge method
class Gen<T>{
  T ob;  //declare N object of type T

  // pass the constructor a referrence to an object
  //of type T
  Gen(T o){
    ob=o;
  }
  //return ob
  T getOb(){
    System.out.print("Gen getOb(): ");
    return ob;
  }
}

// a subclass of gen
class Gen2 extends Gen<String>{
  Gen2(String o){
    super(o);
  }
  // A string specific override of getOb
  String getOb(){
    System.out.print("You called string getOb(): ");
    return ob;
  }
}
//Demonstrate a situation that requires a Bridge method
class BridgeDemo{
  public static void main(String[] args) {
    // Create a Gen2 object for Strings
    Gen2 strOb=new Gen2("Generics test");
    System.out.println(strOb.getOb());
  }
}
