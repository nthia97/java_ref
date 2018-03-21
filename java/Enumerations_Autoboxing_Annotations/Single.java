import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface MySingle{
  int value(); // this variable name must be the value
}

class Single{
  // Annotate a method using a single-member annotation
  @MySingle(100)
  public static void myMeth(){
    Single ob =new Single();

    try{
      Method m=ob.getClass().getMethod("myMeth");
      MySingle anno=m.getAnnotation(MySingle.class);
      System.out.println(anno.value()); //displays 100
    }catch (NoSuchMethodException e) {
      System.out.println("Method Not found");
    }
  }
  public static void main(String[] args) {
    myMeth();
  }
}
