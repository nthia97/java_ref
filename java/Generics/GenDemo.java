// A simple generic class
// Here, T is a type of parameter that will be
//replaced by a real type
// when an object of type gen is created

class Gen<T>{
  T ob;   // create an object of type T

//pass the constructor to a reference to an
// object of type T
  Gen(T o){
    ob=o;
  }

// return ob
  T getOb(){
    return ob;
  }

  //show type
  void showType(){
    System.out.println("Type of T is: "+ob.getClass().getName());
  }
}

//Demonstrate the generic class
class GenDemo{
  public static void main(String[] args) {
    // create a gen reference to integers
    Gen<Integer> iOb;

    //create a gen Integer object and assign its reference
    //to iOb.Notice the use of autoboxing
    // to encapsulate the value 88 within an Integer object.

    iOb = new Gen<Integer>(88);
    //show the type of data used by iOb.
    iOb.showType();
    //Get the value of iOb
    // Note that no cast is needed
    int v=iOb.getOb();
    System.out.println("value: "+v);

    System.out.println();

    //create a gen object for Strings
    Gen<String> strOb= new Gen<String>("Generics test");
    //show the type of data specified by iOb
    strOb.showType();
    // Get the value of strOb. Again, notice
    // that no cast is needed.
    String str=strOb.getOb();
    System.out.println("value: "+str);

  }
}
