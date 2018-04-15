class rectA{
	double  base;
	double  height;

	//constructor for triangle
	rectA(){
	base =3; 
	height=4;
	}

	//compute area
	double area(){
		return 0.5*base*height;
	}
}

class rect{
	public static void main(String args[]){
		rectA myTri = new rectA();

		double area;

		area=myTri.area();
		System.out.println("area of the triangle "+area);
	}
}


