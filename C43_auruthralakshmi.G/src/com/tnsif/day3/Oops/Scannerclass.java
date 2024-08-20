package com.tnsif.day3.Oops;
import java.util.Scanner;
public class Scannerclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); // Syntax for the scanner class
		System.out.println("Enter your name:");
		String str = sc.nextLine();
		System.out.println("Your name is "+str);
sc.close();
	}

}
