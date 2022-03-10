package com.Bridgelabz.logical;

public class Fibonacci {

	public static void main(String[] args) {
	 int n = 20, firstTerm = 0, secondTerm = 1;
	 System.out.println("Fibonacci Series till " + n + " term:");
	 
	 for(int i = 1;i <= n;++i)
	 {
		 System.out.println("Fibonacci series :"+firstTerm);
		 int nextTerm = firstTerm + secondTerm;
		 firstTerm = secondTerm;
		 secondTerm = nextTerm;
	 }
	}
}
