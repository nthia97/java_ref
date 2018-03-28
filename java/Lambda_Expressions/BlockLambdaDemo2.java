// A block lambda that reverses the character in a String
interface StringFunc{
  String func(String n);
}
class BlockLambdaDemo2{
  public static void main(String[] args) {
    //This block lambda reverses the character in a String
    StringFunc reverse= (str)->{
      String result="";
      for(int i=str.length()-1;i>=0;i--)
        result+=str.charAt(i);

        return result;
    };

    System.out.println("Lambda reversed is: "+reverse.func("lambda"));
    System.out.println("Expression reversed is: "+reverse.func("Expression"));
  }
}
