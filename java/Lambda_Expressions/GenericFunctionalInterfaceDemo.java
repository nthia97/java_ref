// use a generic functional interface with lambda expressions

// a functional interface
interface SomeFunc<T>{
  T func(T t);
}
class GenericFunctionalInterfaceDemo{
  public static void main(String[] args) {
    //use a String-based version of SomeFunc
    SomeFunc<String> reverse=(str)->{
      String result="";
      for(int i=str.length()-1;i>=0;i--)
          result+=str.charAt(i);

      return result;
    };

    System.out.println("Lambda reversed is: "+reverse.func("lambda"));
    System.out.println("Expression reversed is: "+reverse.func("Expression"));

    // Now use an Integer based version of SomeFunc
    SomeFunc<Integer> factorial=(n)->{
      int result=1;
      for(int i=1;i<=n;i++)
        result*=i;

        return result;
      };
        System.out.println("The factorial of 3 is "+factorial.func(3));
    		System.out.println("The factorial of 5 is "+factorial.func(5));
  }
}
