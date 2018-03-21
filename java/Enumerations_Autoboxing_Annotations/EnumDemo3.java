/*
 * EnumDemo3.java
 * 
 * Copyright 2018 Paul Mburu <paulmburu53@gmail.com>
 * 
 * Use an enum constructor, instance variable and method
 * 
 * 
 */

enum Apple {
	Jonathan(10), GoldenDel(9), RedDel(12), Winesap(15), Cortland(8);
	
	private int price; //price of each Apple
	
	Apple(int p){
		price=p;
		}
	int getPrice(){
		return price;
		}
	}

public class EnumDemo3{
	
	public static void main (String args[]) {
		Apple ap;
		
		// Display price of Winesap
		
		System.out.println("Winesap costs: "+Apple.Winesap.getPrice()+"cents. \n");
		
		// Display all Apples and prices
		for(Apple a:Apple.values()){
			System.out.println(a+" costs "+a.getPrice()+" cents.");
			}
		
	}
}



