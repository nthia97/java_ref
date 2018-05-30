class PrintArrayShapes{
	public static void main(String args[]){
		System.out.println("THE FIRST SHAPE: ");
		for(int i=1;i<=6;i++){
			for(int j=1;j<=i;j++){
			System.out.print(j);	
			}
			for(int k=6;k>i;k--){
				System.out.print("*");
				}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("THE SECOND SHAPE: ");
		
		for(int i=6;i>=1;i--){
			for(int j=1;j<i;j++){
				System.out.print(j);
			}
			for(int k=6;k>=i;k--){
				System.out.print("&");
				}
			System.out.println();
		}
		System.out.println();
		System.out.println("THE THIRD SHAPE: ");
		for(int i=1;i<=6;i++){
			for(int j=1;j<=i;j++){
				System.out.print("@");
				}
			System.out.println();
			}
	}
}
