// use a wildcard
class Stats<T extends Number> {
  T[] nums;  //Array of Number of classes


  //Pass reference constructor to
  //an array of type number or subclass

 Stats(T[] o){
    nums=o;
  }

//Return type double in all the classes
  double average(){
    double sum=0.0;
    for(int i=0;i<nums.length;i++)
      sum+=nums[i].doubleValue();

      return sum/nums.length;
    
  }

    //Determine if two averages are the same;
    //Notice the use of wildcard.
    boolean sameAvg(Stats<?> ob){
      if(average()==ob.average())
        return true;
        
      return false;
    }
}
//Demonstrate wildcard
class WildCardDemo{
  public static void main(String[] args) {
    Integer inums[]={1,2,3,4,5};
    Stats<Integer> iob = new Stats<Integer>(inums);
    double v=iob.average();
    System.out.println("iob average is: "+v);

    Double dnums[]={1.1,2.2,3.3,4.4,5.5};
    Stats<Double> dob= new Stats<Double>(dnums);
    double w=dob.average();
    System.out.println("average for dob is: "+w);

    Float fnums[]={1.0F,2.0F,3.0F,4.0F,5.0F};
    Stats<Float> fob=new Stats<Float>(fnums);
    double x=fob.average();
    System.out.println("Average of fob is: "+x);

    //See which arrays have the same average
    System.out.print("Average of iob and dob ");
    if(iob.sameAvg(dob))
      System.out.println("Are the same.");
    else
      System.out.println("Differ.");

    System.out.print("Average off iob and fob ");
    if(iob.sameAvg(fob))
      System.out.println("Are the same.");
    else
      System.out.println("Differ.");
    

  }
}
