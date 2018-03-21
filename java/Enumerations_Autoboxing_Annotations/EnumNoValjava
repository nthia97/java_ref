/*
 * EnumNoValjava
 * 
 * Copyright 2018 Paul Mburu <paulmburu53@gmail.com>
 * 
 * 
 * 
 */

enum Apple{
	Jonathan(10), GoldenDel(9), RedDel, Winesap(15), Cortland(8);
	
	private int price;
	
	Apple(int price){
		this.price=price;
		}
	
	Apple(){
	this.price=-1;
	}
	int getPrice(){
		return price;
		}
	}

public class EnumNoVal {
	
	public static void main (String args[]) {
		Apple ap;
		
		for(Apple a:Apple.values()){
			System.out.println(a+" costs "+a.getPrice()+" cents");
			}
	}
}

