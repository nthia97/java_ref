// In this version of Stats, the type argument of
// T must be either a Number, or a class
// derived from Number.

class Stats<T extends Number>{
  T[] nums; //Array of Numbers or subclass

/* Pass the constructor a reference to
 *  an Array of type Number or subclass
 */
  Stats(T[] o){
    nums=o;
  }
  //return type Double in all cases
  double average(){
    double sum=0.0;
    for(int i=0;i<nums.length;i++)
      sum+=nums[i].doubleValue();

    return sum/nums.length;
  }
}

//Demonstrate Stats
class BoundsDemo{
  public static void main(String[] args) {
    Integer inums[]={1,2,3,4,5};
    Stats<Integer> iOb = new Stats<Integer>(inums);

    double v=iOb.average();
    System.out.println("iOb average is: "+v);

    Double dnums[]={1.1,2.2,3.3,4.4,5.5};
    Stats<Double> dob=new Stats<Double>(dnums);
    double w=dob.average();
    System.out.println("Dob average is: "+w);

    //This won't compile because String is not a
    // subclass of Number.
    // String strs[] = { "1", "2", "3", "4", "5" };
    // Stats<String> strob = new Stats<String>(strs);
    //
    // double x = strob.average();
    // System.out.println("strob average is " + v);
  }
}
