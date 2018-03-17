/*
 * Deadlock.java
 * 
 * Copyright 2018 Paul Mburu <paulmburu53@gmail.com>
 * 
 */

class  A {
	synchronized void foo(B b){
		String name=Thread.currentThread().getName();
		System.out.println(name+" entered A.foo");
		
		try{
			Thread.sleep(1000);
			}catch(Exception e){
				System.out.println("Interrupted ");
				}
				System.out.println(name +" trying to call B.last()");
				b.last();
		}
	synchronized void last(){
		System.out.println("Inside A.last");
		}
	}
class B {
	synchronized void bar(A a){
		String name=Thread.currentThread().getName();
		System.out.println(name+" entered B.bar");
		try{
			Thread.sleep(1000);
			}catch(Exception e){
				System.out.println("Interrupted");
				}
			System.out.println(name+" trying to call A.last");
			a.last();
		}
		synchronized void last(){
			System.out.println("Inside  A.last");
			}
	}

public class Deadlock implements Runnable {
	A a=new A();
	B b=new B();
	
	Deadlock(){
		Thread.currentThread().setName("Main thread");
		Thread t=new Thread(this,"Racing Thread");
		t.start();
		
		a.foo(b); //get lock on this thread 
		System.out.println("Back in main thread");
		}
		public void run(){
			b.bar(a); //get lock on B in other thread
			}
	
	
	public static void main (String args[]) {
		new Deadlock();
	}
}

