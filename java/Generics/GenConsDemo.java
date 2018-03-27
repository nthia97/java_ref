// Use a generic constructor
class GenCons{
  private double val;

  <T extends Number> GenCons(T arg){
    val=arg.doubleValue();
  }

  void showVal(){
    System.out.println("Val : "+ val);
  }
}
class GenConsDemo{
  public static void main(String[] args) {
    GenCons test=new GenCons(100);
    GenCons test1=new GenCons(123.5F);

    test.showVal();
    test1.showVal();

  }
}
