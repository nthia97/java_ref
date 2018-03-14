class MyIFImp2 implements MyIF {
	// Here, implements for both getNumber() and getString() are provided
	public int getNumber(){
		return 100;
	}

	public String getString(){
		return "This is a different string.";
	}
	public static void main(String args[]){
		MyIFImp2 obj = new MyIFImp2();
		System.out.println(obj.getNumber());
		System.out.println(obj.getString());
}
}
