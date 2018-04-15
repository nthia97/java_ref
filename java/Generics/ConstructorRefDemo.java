// Demonstrate a constructor reference

//MyFunc is a functional interface whose method returns
//  MyClass reference
interface MyFunc{
  MyClass func(int n);
}
class MyClass{
  private int val;
// This constructor takes an argument
MyClass(int v){val=v;}
//This is the default constructor
MyClass(){val=0;}
int getVal(){return val;}
}
class ConstructorRefDemo{
  public static void main(String[] args) {
    //create a reference to MyClass constructor
    //Because func() in MyFunc takes an argument, new
    //refers to the parameterized constructor in MyClass,
    //not the default constructor.
    MyFunc myClassCons = MyClass::new;
    //create  an instance if MyClass via that constructor reference.
    MyClass mc = myClassCons.func(100);
    //Use the interface of MyClass just created.
    System.out.println("val in mc is "+mc.getVal());
  }
}
