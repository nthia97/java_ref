import java.lang.annotation.*;
import java.lang.reflect.*;

// A marker annotation
@Retention(RetentionPolicy.RUNTIME)
@interface MyMarker{}
  class Marker{
    // annotate a method using a Marker
    // Notice no () is needed
    @MyMarker
    public static void myMeth(){
      Marker ob=new Marker();
      try{
        Method m=ob.getClass().getMethod("myMeth");
        //determine if the annotation is present
        if(m.isAnnotationPresent(MyMarker.class))
          System.out.println("MyMarker is present");
      }catch (NoSuchMethodException e) {
        System.out.println("Method Not Found");
      }
    }
    public static void main(String[] args) {
      myMeth();
    }
  }
