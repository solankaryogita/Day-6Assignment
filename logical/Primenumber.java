package com.Bridgelabz.logical;

import java.util.Scanner;

public class Primenumber {

	public static void main(String[] args) {
	int num,i,prime = 1;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number");
	num = sc.nextInt();
	if(num%2 == 0)
	{
		System.out.println("number is not prime :"+num);
	}
	else {
		System.out.println("number is prime :"+num);	
	}
	}
}