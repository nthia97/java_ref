import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [][] lines = new int[5][2];
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++){
            char operation = scanner.next().charAt(0);
            /* populate the array list of lines */
            if (operation=='+'){
                int k = scanner.nextInt();
                int b = scanner.nextInt();
                for (int j = 0; j < lines.length; j ++){
                    if (lines[j][0] == 0) {
                        lines[j][0]= k;
                        lines[j][1]= b;
                        break;
                    }

                }
            }

            /* remove a line from the array list of lines*/
            if (operation=='-'){
                int k = scanner.nextInt();
                int b = scanner.nextInt();
                for (int j = 0; j < lines.length; j ++){
                    if (lines[j][0]==k && lines[j][1]==b) {
                        lines[j][0]= 0;
                        lines[j][1]= 0;
                        break;
                    }

                }
            }

            /* processing here */
            if (operation=='?'){
                int q = scanner.nextInt();
                int max = 0;
                for (int j = 0; j < lines.length;  j++){
                    double results = ( (double) q - (double) lines[j][1] ) / (double) lines[j][0];
                    if (results % 1 == 0) max++;
                    if (lines[j][0]==0 && lines[j][1]==0) break;
                }
                System.out.println(max);
            }
        }
    }
}