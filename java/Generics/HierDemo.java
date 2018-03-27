// A subclass can add its own type parameters
class Gen<T>{
  T ob; //Create object of type T

  // pass the constructor a reference
  //to an object of type T
  Gen(T o){
    ob=o;
  }
  // Return ob
  T getOb(){
    return ob;
  }
}

// A subclass of Gen that defines
//a second type parameter, called V
class Gen2<T,V> extends Gen<T> {
  V ob2;

  Gen2(T o1,V o2){
    super(o1);
    ob2=o2;
  }
  
  V getOb2(){
    return ob2;
  }
}
//Create an object of type Gen2
class HierDemo{
  public static void main(String[] args) {
    // Create a Gen2 object for String and Integer
    Gen2<String,Integer>  x=new Gen2<String,Integer>("Value is: ",99);

    System.out.print(x.getOb());
    System.out.println(x.getOb2());
  }
}
