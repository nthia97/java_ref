package Day_16_Exceptions;

import java.util.Scanner;

public class Solution {
    public void stringToInt(){

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();

        try {
            System.out.println(Integer.parseInt(S));
        }catch (NumberFormatException e){
            System.out.println("Bad String");
        }

    }
}
