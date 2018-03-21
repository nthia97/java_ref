// Show all annotations for a class and a method
import java.lang.annotation.*;
import java.lang.reflect.*;

// An Annotation type declaration
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno {
  String str();
  int val();
}
class Meta {
	// Annotate a method.
  @MyAnno(str="Annotation example",val=100)

  public static void MyMeth(){
    Meta ob= new Meta();

    // obtain the Annotation of this method
    // and display the values of the members
    try{
      // first get a class object that represents this class
      Class<?> c=ob.getClass();

      //Now get an object that represents this method
      Method m = c.getMethod("MyMeth");
      // Next, get Annotation for this getClass
      MyAnno anno=m.getAnnotation(MyAnno.class);
      // Finally display the values
      System.out.println(anno.str()+" "+anno.val());
    }catch(NoSuchMethodException e){
      System.out.println("Method not found.");
    }

  }
  public static void main(String[] args) {
    MyMeth();
  }
}
