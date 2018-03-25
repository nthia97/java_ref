/* This version of the ShowFile program uses a try-with-resources
statement to automatically close a file after it is no longer needed.
Note: This code requires JDK 7 or later.
*/

import java.io.*;

class AutoShowFile{
  public static void main(String[] args) {
    int i;

    if(args.length!=1){
      System.out.println("Usage: AutoShowFile filename");
      return;
    }

    try(FileInputStream fin = new FileInputStream(args[0])){
      do{
        i=fin.read();
        if(i!=-1)System.out.print((char)i);
      }while(i!=1);
      }catch(FileNotFoundException e){
        System.out.println("File Not Found");
      }catch(IOException e){
        System.out.println("An I/O Error occured");
      }
  }
}
