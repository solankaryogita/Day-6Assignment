package com.Bridgelabz.JUnit;

import java.util.Scanner;

public class DecimaltoBinary {
	static boolean powerOf2(int n) {
		
		int i = 0, temp = (int) Math.pow(2, i);
		while (temp < n) {
			if (temp == n) {
				return true;
			}
			    i++;
		}
		        return false;
	}
	public static void main(String[] args) {
		
			int n, count = 0, a=0;
			String x = "";
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter any decimal number:");
			n = sc.nextInt();
	        while(n > 0)
	        {
	            a = n % 2;
	            if(a == 1)
	            {
	                count++;
	            }
	            x = a + "" + x;
	            n = n / 2;
	        }
	        System.out.println("Binary number:"+x);
	        System.out.println("No. of 1s:"+count);
	        int  temp = (int) Math.pow(2, n);
	        if(powerOf2(n))
	        {
				System.out.println("its power of 2" );
	        }
	        else 
	        {
				System.out.println("not power of 2");
	        }
	}
}
