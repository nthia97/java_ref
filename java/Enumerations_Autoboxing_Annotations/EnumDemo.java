/*
 * 2018-03-15  Paul Mburu  <paulmburu53@gmail.com>
 * 
 *  An enumaration of Apple varieties
 * 
 */

enum Apple{
	Jonathan, GoldenDel, RedDel, Winesap, Cortland
	}
	
class EnumDemo{
	public static void main(String args[]){
		Apple ap;
		
		ap=Apple.RedDel;
		
		// output an enum value
		System.out.println(ap);
		System.out.println();
		
		ap=Apple.GoldenDel;
		
		//compare two enums
		if(ap==Apple.GoldenDel)
			System.out.println("ap contains GoldenDel. \n");
			
		//use an enum to control a switch statement
		switch(ap){
			case Jonathan:
				System.out.println("Jonathan is red");
				break;
			case GoldenDel:
				System.out.println("Golden delicious is yellow");
				break;
			case RedDel:
				System.out.println("Red delicious is red");
				break;
			case Winesap:
				System.out.println("Winesap is red");
				break;
			case Cortland:
				System.out.println("Cortland is red");
				break;
			
			}
		
		}
	}


