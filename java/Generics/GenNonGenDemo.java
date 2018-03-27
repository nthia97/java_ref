// A non-generic can be the superclass
//of a generic subclass
class NonGen{
  int num;

  NonGen(int o){
    num=o;
  }

  int getNum(){
    return num;
  }
}

// a generic subclass
class Gen<T> extends NonGen{
   T ob;  //Declare object of Type T

   // pass a constructor a reference to an
   //object of type T
   Gen(T o1,int o2){
     super(o2);
     ob=o1;
   }
   //return ob
   T getOb(){
     return  ob;
   }
}
class GenNonGenDemo{
  public static void main(String[] args) {

    //Create a Gen object for string.
    Gen<String> w=new Gen<String>("Hello ",47);

    System.out.print(w.getOb()+" ");
    System.out.println(w.getNum());

  }
}
