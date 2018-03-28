// Generating a Generic method of a Generic class
class Gen<T>{
  T ob;  //Declare an object of type T

  // Pass the constructor a referrence of an object
  //of type T
  Gen(T o){
    ob=o;
  }
//return ob
  T getOb(){
    System.out.print("Gen getOb() :");
    return ob;
  }
}

// A subclass of Gen that overrides getOb
class Gen2<T> extends Gen<T>{
  Gen2(T o){
    super(o);
  }

  //override getOb
  T getOb(){
    System.out.print("Gen2 getOb() :");
    return ob;
  }
}

//Demonstrate Generic method overrides
class OverrideDemo{
  public static void main(String[] args) {
    // Get a gen object for Integers
    Gen<Integer> iob=new Gen<Integer>(88);
    // Get a gen2 object for Integers
    Gen2<Integer> iob2=new Gen2<Integer>(99);
    // Get a gen object for Strings
    Gen2<String> strob=new Gen2<String>("Generics Test");

    System.out.println(iob.getOb());
    System.out.println(iob2.getOb());
    System.out.println(strob.getOb());

  }
}
