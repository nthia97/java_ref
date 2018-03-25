// Use a BufferedReader to read characters from the console.
import java.io.*;

class BRRread{
	public static void main(String args[]) throws IOException
	{
		char c;
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enters characters, 'q'to exit");

		//reads characters
		do{
			c=(char)br.read();
			System.out.println(c);
		}while(c!='q');
	}
}
