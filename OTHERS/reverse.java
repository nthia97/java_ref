class reverse{
	public static void main(String args[]){
		double a[]={0,1,2,3,4,5,6,7,8,9};
		int N=a.length;
		for(int i=0;i<N/2;i++)
		{
			double temp=a[i];
			a[i] = a[N-1-i];
			a[N-i-1]=temp;
		}
		for(double x:a)System.out.print(x+" ");
	}
}
