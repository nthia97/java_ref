import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class LineIntersection {
//    public int i,j;
//
//    public void  setInt(int i,int j){
//        this.i=i;
//        this.j=j;
//    }
//    public int getInt(){
//        return i;
//    }

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int n=scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");
        List<int[]> coordinates=new ArrayList<int[]>(100000);

//        coordinates.add(new int[]{3,4});
//        System.out.println(coordinates.get(0)[1]);
        System.out.println(coordinates.size());
        for (int i=0;i<n;i++){
            char operation=scanner.next().charAt(0);
            if(operation=='+'){
                int k=scanner.nextInt();
                int b=scanner.nextInt();

                for(int j=0;j<coordinates.size();j++)
                    if(coordinates.get(j)[0]==0){
                        coordinates.add(j,new int[]{k,b});
                        break;
                    }
            }

        }
        System.out.println(coordinates.get(0));
        scanner.close();
    }
}
