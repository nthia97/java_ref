// use static import to bring sqrt() and pow() into view
import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

//compute the hypotenuse of a right triangle
public class StaticHypot{
  public static void main(String[] args) {
    double side1,side2,hypot;
    side1=3.0;
    side2=4.0;

    // Here sqrt() and pow() can be called by themselves
    //without their class names
    hypot=sqrt(pow(side1,2)+pow(side2,2));
    System.out.println("Given sides of length: "+side1+" and "+side2+
    " hypotenuse is: "+hypot);

  }
}
