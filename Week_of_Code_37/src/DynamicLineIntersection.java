import java.util.Scanner;

public class DynamicLineIntersection {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int arr[][]=new int[5][2];

        for (int i=0;i<n;i++){
            char operation=scanner.next().charAt(0);
            if(operation=='+'){
                int k=scanner.nextInt();
                int b=scanner.nextInt();

                for(int j=0;j<arr.length;j++)
                    if(arr[j][0]==0){
                        arr[j][0]=k;
                        arr[j][1]=b;
                        break;
                    }


            }


            if(operation=='-'){
                int k=scanner.nextInt();
                int b=scanner.nextInt();
                for(int j=0;j<arr.length;j++)
                    if (arr[j][0]==k && arr[j][1]==b){
                        arr[j][0]=0;
                        arr[j][1]=0;
                        break;
                    }
            }

            if (operation=='?'){
                int q=scanner.nextInt();
                int lines=0;
                for(int j=0;j<arr.length;j++){
                    double ans=((double)q-(double)arr[j][1])/(double)arr[j][0];
                    if(ans%1==0)lines++;
                    if(arr[j][0]==0 && arr[j][1]==0)break;
                }
                System.out.println(lines);
            }
        }
    }

}
