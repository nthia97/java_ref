// A simple gen with two types
// Parameters: T and V
class TwoGen<T,V>{
  T ob1;
  V ob2;

  // Pass the constructor a reference to
  // an object of type T and an object of type V.
  TwoGen(T o1,V o2){
    ob1=o1;
    ob2=o2;
  }
//show types of T and V
void showTypes(){
  System.out.println("Type of T is: "+ob1.getClass().getName());
  System.out.println("Type of V is: "+ob2.getClass().getName());
}

  T getOb1(){
    return ob1;
  }
  V getOb2(){
    return ob2;
  }
}
//Demonstrate TwoGen
class SimpleGen{
  public static void main(String[] args) {
    TwoGen<Integer,String> tgObj= new TwoGen<Integer,String>(88,"Generics");

    // show types
    tgObj.showTypes();
    System.out.println();

    // obtain the show values
    int v=tgObj.getOb1();
    System.out.println("Value: "+v);

    String str=tgObj.getOb2();
    System.out.println("Value: "+str);


  }
}
