// Demonstrate several type annotations.
import java.lang.annotation.*;
import java.lang.reflect.*;

// A marker annotation that can be applied to a type.
@Target(ElementType.TYPE_USE)
@interface TypeAnno {}

// Another marker annotation that can be applied to a type.
@Target(ElementType.TYPE_USE)
@interface NotZeroLen {}

// Still another marker annotation that can be applied to a type.
  @Target(ElementType.TYPE_USE)
  @interface Unique {}

// A parameterized annotation that can be applied to a type.
@Target(ElementType.TYPE_PARAMETER)
@interface MaxLen {
  int value();
}

// An annotation that can be applied to a type parameter.
@Target(ElementType.TYPE_USE)
@interface What{
  String description();
}
// An annotation that can be applied to a field declaration.
@Target(ElementType.FIELD)
@interface EmptyOk {}

// An annotation that can be applied to a method declaration.
@Target(ElementType.METHOD)
@interface Recommended{}

// Use an annotation on a type parameter
class TypeAnnoDemo<@what(description="Generic data type" )T>{
  // use a type annotation on a constructor
  public @Unique TypeAnnoDemo(){}

    // Annotate a type (in this case a string ), Not a field
    @TypeAnno String str;

    //This Annotates the filed
    @EmptyOk String str;

    //use a type annotation to Annotate this (the reciever).
    public int f(@TypeAnno TypeAnnoDemo<T> this ,int x){
      return 10;
    }
  // Annotate the return Type
  public @TypeAnno Integer f2(int j,int k){
    return j+k;
  }
  // Annotate the method declaration
  public @Recommended Integer f3(String str){
    return str.length/2;
  }

  //use a type annotation with the throws clause.
  public void f4() throws @TypeAnno NullPointerException{
    // ...
  }
  // Annotate Array levels.
  String @MaxLen(10) [] @NotZeroLen [] w;

  // Annotate array element type.
  @TypeAnno Integer[] vec;

  public static void myMeth(int i){
    //use a type annotation on a type argument
    TypeAnnoDemo<@TypeAnno Integer> ob=new TypeAnnoDemo<@TypeAnno Integer>();

    //use a type annotation with new
    @Unique TypeAnnoDemo<Integer> ob=new @Unique TypeAnnoDemo<Integer>();
    Object x=new Integer(10);
    Integer y;

    //use a type annotation on cast
    y=(@TypeAnno Integer)x;

  }
  public static void main(String args[]) {
    myMeth(10);
}
// Use type annotation with inheritance clause.
class SomeClass extends @TypeAnno TypeAnnoDemo<Boolean> {}
}
