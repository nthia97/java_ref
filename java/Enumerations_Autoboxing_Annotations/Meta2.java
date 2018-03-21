
import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno {
  String str();
  int val();
}
class Meta2 {
  //MyMeth has two parameters
  @MyAnno(str="Two parameters",val=19)

  public static void MyMeth(String str,int val){
    Meta2 ob=new Meta2();

    try{
      Class<?> c=ob.getClass();

      //Here the parameter types are specified.
      Method m=c.getMethod("MyMeth",String.class,int.class);
      MyAnno anno = m.getAnnotation(MyAnno.class);
      System.out.println(anno.str()+" "+anno.val());
    }catch(NoSuchMethodException e){
      System.out.println("Method Not found");
    }
  }
  public static void main(String[] args) {
    MyMeth("Test",10);
  }
}
