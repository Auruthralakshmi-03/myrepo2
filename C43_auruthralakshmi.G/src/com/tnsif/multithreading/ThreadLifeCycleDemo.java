package com.tnsif.multithreading;

public class ThreadLifeCycleDemo {
public static void main(String[] args)
{
	MyChildThread myThread= new MyChildThread();
	System.out.println("Before Runnable stage Thread"+ "is alive or not?"+myThread.isAlive()); 
	myThread.start();
	try {
		Thread.sleep(4000);
	
	}
	catch(InterruptedException exp)
	{
		System.out.println("After complete excuetion"+"of Thread, it is alive or not?+ myThread.isAlive()");
	}
}
}
