/* A version of CopyFile that uses try-with-resources.
It demonstrates two resources (in this case files) being
managed by a single try statement.
*/

import java.io.*;

class AutoCopyFile{
  public static void main(String[] args) {
    int i;
    //First confirm both files have specified.
    if(args.length!=2){
      System.out.println("Usage: AutoCopyFile from to");
    }
    //Open and manage two files via the try statement.
    try(FileInputStream fin = new FileInputStream(args[0]);
    FileOutputStream fout = new FileOutputStream(args[1])){
      do{
        i=fin.read();
        if(i!=-1)fout.write(i);
      }while(i!=-1);
    }catch (IOException e) {
      System.out.println("I/O Error: "+e);
    }
  }
}
