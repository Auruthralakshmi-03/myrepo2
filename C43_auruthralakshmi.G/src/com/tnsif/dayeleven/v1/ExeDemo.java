package com.tnsif.dayeleven.v1;
import java.util.Scanner;
public class ExeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
try 
{
	System.out.println("Enter the number:");
	int number= sc.nextInt();
	System.out.println(number%2==0?number+"is Even":"is Odd");
	return;
	
	}
catch(Exception e)
{
	System.err.println("Invalid input");
	

}
finally {
	System.out.println("In Finally");
	sc.close();
}
}
}