//Timing programme execution
class Elapsed{
  public static void main(String[] args) {
    long start,end;

    System.out.println("Timing for a loop from 0 to 100,000,000");

    // time for a loop from 0 to 100,000,000
    // start=System.nanoTime();
    start=System.currentTimeMillis();  //get starting time
    for(long i=0;i<100000000L;i++)
    	;
    end=System.currentTimeMillis();  //get ending time
    // end=System.nanoTime();

    System.out.println("Elapsed time "+(end-start));

  }
}
