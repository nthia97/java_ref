import java.util.*;
class MatrixMult{
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		int a[][]=new int[N][N];
		int b[][]=new int[N][N];

		System.out.println("Enter your first Array");
		for(int i=0;i<N;i++)
			for(int j=0;j<N;j++)
				a[i][j]=in.nextInt();
				
		System.out.println("Enter your second Array");
		for(int i=0;i<N;i++)
			for(int j=0;j<N;j++)
				b[i][j]=in.nextInt();
			

		for(int i=0;i<N;i++){
			for(int j=0;j<N;j++)
				System.out.print(a[i][j]+" ");
			System.out.println();
		}
		
			double[][] c = new double[N][N];
			for (int i = 0; i < N; i++)
				for (int j = 0; j < N; j++)
				{ // Compute dot product of row i and column j.
				for (int k = 0; k < N; k++)
					c[i][j] += a[i][k]*b[k][j];
				}
		
		//output of matrix multiplication
		for(int i=0;i<N;i++){
			for(int j=0;j<N;j++)
				System.out.print(c[i][j]+" ");
			System.out.println();
		}


	}
}
