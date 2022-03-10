package com.Bridgelabz.JUnit;

import java.util.Scanner;

public class MonthlyPayment {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Principal");
		double principal = sc.nextDouble();
		System.out.println("Enter the year");
	    double years = sc.nextDouble();
	    System.out.println("Enter the rate");
	    double rate = sc.nextDouble();

	    double r = (rate / 100) / 12;   
	    double n = 12 * years;          
	    
	    double payment  = (principal * r) / (1 - Math.pow(1+r, -n));
	    double interest = payment * n - principal;

	    System.out.println("Monthly payments = " + payment);
        System.out.println("Total interest   = " + interest);
	}
}
