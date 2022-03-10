package com.Bridgelabz.logical;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		int n , sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		n = sc.nextInt();
		for(int i = 1;i < n;i++)
		{
			if(n % i == 0)
			{
				sum = sum + i;
			}
		}
		if(sum == n)
		{
			System.out.println("Given Number is perfect number:"+n);
		}
		else 
		{
			System.out.println("Given Number is not perfect number:"+n);
		}
	}
	int divisor(int x)
	{
		return x;
	}
}
	

