import java.util.Scanner;
class Performance {

	static double averageOfTopEmployees(int n){
		double sum=0;
		double count=0;
		Scanner in=new Scanner(System.in);
		for(int i=0;i<n;i++){
			double NI=in.nextDouble();
			if(NI>90){
                sum=sum+NI;
                count++;
			}
		}

		return sum/count;
	}

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		double answer=averageOfTopEmployees(n);
		System.out.println(answer);
			
	}
}