// Demonstrate the stack class

import java.util.*;
class StackDemo{
	static void showpush(Stack<Integer> st,int a){
		st.push(a);
		System.out.println("push ("+a+")");
		System.out.println("stack: "+st);
	}

	static void showpop(Stack<Integer> st){
		System.out.print("Pop -> ");
		Integer a=st.pop();
		System.out.println(a);
		System.out.println("Stack: "+st);
	}

	public static void main(String[] args) {
		Stack<Integer> st=new Stack<Integer>();

		System.out.println("Stack: "+st);
		showpush(st,45);
		showpush(st,98);
		showpush(st,65);
		showpop(st);
		showpop(st);
		showpop(st);

		try{
			showpop(st);
		}catch(EmptyStackException e){
			System.out.println(e);
		}
	}

}