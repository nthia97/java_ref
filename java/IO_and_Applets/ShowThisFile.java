/* Display a text file.
To use this program, specify the name
of the file that you want to see.
For example, to see a file called TEST.TXT,
use the following command line.
java ShowFile TEST.TXT
This variation wraps the code that opens and
accesses the file within a single try block.
The file is closed by the finally block.
*/
import java.io.*;
class ShowThisFile{
  public static void main(String[] args) {
    int i;
    FileInputStream fin=null;

    if(args.length!=1){
      System.out.println("Usage : ShowThisFile filename");
      return;
    }

    try{
      fin=new FileInputStream(args[0]);

      do{
        i=fin.read();
        if(i!=-1)System.out.print((char)i);
      }while(i!=-1);
    }catch (IOException e) {
      System.out.println("IO Error :"+e);
    }finally{
      //close file in all classes
      try{
        if(fin!=null)fin.close();
      }catch (IOException e) {
        System.out.println("Error closing the file");
      }
    }
  }
}
