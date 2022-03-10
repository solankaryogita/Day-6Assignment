package com.Bridgelabz.JUnit;

import java.util.Scanner;

public class TempratureConversion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the temp c or f");
		int t=sc.nextInt();
		System.out.println("Temprature convert Celsius to Fahrenheit  :" +((t * 1.8) + 32 ));
		
		System.out.println("Enter the temp c or f");
		double t1=sc.nextDouble();
	    System.out.println("Temprature convert Fahrenheit to Celsius Formula :" +((t1 - 32) / 1.8 ));
	}
}
