package com.Bridgelabz.logical;

import java.util.Scanner;

public class Reversenumber {

	public static void main(String[] args) {
	int num=0, rev_num = 0;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number");
	num = sc.nextInt();
	while(num>0)
	{
		rev_num = rev_num*10 + (num%10);
		num = num/10;
	}
	System.out.println("The reversed number is :"+rev_num);
	}
}
