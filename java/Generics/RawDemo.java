// Demonstrate a raw types
class Gen<T> {
  T ob; //Declare object of type T

  // Pass the costructor a reference to an object of type T
  Gen(T o){
    ob=o;
  }

  //return object of type T
  T getOb(){
    return ob;
  }
}
// Demonstrate Raw type
class RawDemo{
public static void main(String[] args) {

  // create a Gen object for integers
  Gen<Integer> iob= new Gen<Integer>(88);

  // Create a Gen object for Strings
  Gen<String> strob= new Gen<String>("Generics test");

  // create a raw-type Gen object and give it
  // a double type
  Gen raw= new Gen(new Double(98.6));

  //cast here is necessary because type is unknown
  double d=(Double)raw.getOb();
  System.out.println("Value :"+d);

  // The use of a raw type can lead to run-time
// exceptions. Here are some examples.
 // The following cast causes a run-time error!
//int i = (Integer) raw.getob(); // run-time error
 // This assignment overrides type safety.
//strOb = raw; // OK, but potentially wrong
//String str = strOb.getob(); // run-time error
 // This assignment also overrides type safety.
//raw = iOb; // OK, but potentially wrong
//d = (Double) raw.getob(); // run-time error
}
}
