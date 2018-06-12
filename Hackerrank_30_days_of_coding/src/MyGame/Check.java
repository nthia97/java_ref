package MyGame;

import java.util.Scanner;

public class Check {

    public static void vertical(){
        System.out.print("|");
    }
    public static void horizontal(){
        System.out.print("___");
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int in;
        while((in=scanner.nextInt())!=0){
            if(in==2)
                vertical();
            else if(in==6)
                horizontal();
        }
//        for(int i=0;i<=10;i++){
//            vertical();
//            for (int j=0;j<=10;j++){
//                horizontal();
//            }
//
//            vertical();
//            System.out.println();
//        }
    }

}
