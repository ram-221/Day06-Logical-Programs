package com.logicalprogramsday05;
import java.util.Scanner;

public class PrimeNumber {
	
	public static  int check_prime(int n)
	{
	   int i;
	   for ( i = 2 ; i <= n-1 ; i++ )
	   { 
	      if ( n%i == 0 )
	     return 0;
	   }
	   return 1;
	}

	public static void main(String[] args) {
		int n, result;
		Scanner scanner = new Scanner(System.in);
	    System.out.println("Enter an integer to check whether it is prime or not.");
		n = scanner.nextInt(); 
		scanner.close();
		result = check_prime(n);
		if ( result == 1 )
		      System.out.println("Number is Prime");
		else
		      System.out.println("Number is not prime");

	}

}
