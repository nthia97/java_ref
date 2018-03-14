import java.io.*;
import java.util.*;
class SplitString {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        
        s=s.trim();
        
        if (s.length() == 0) {
            System.out.println(0);
            return;
}
        String[] tok=s.split("[ !,?\\._'@]+",0);
        
        System.out.println(tok.length);
        for(String ts:tok)
			System.out.println(ts);
		
        scan.close();
    }
}
