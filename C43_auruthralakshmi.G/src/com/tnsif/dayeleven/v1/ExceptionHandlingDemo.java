package com.tnsif.dayeleven.v1;

public class ExceptionHandlingDemo {

	public void Demo() {
		// TODO Auto-generated method stub
int a=5/0;
System.out.println(a);
	}
	public void show() {
		try
		{
			Demo();
		}
		catch(Exception e)
		{
			System.out.println("Exception---->"+e);
		}finally
		{
			System.out.println("Hello world");
		}
	}

}
