package com.logicalprogramsday05;
import java.util.Scanner;
public class PerfectNumber {

	public static int isPerfect(int num) {
		int sum=0;
		for(int i=1;i<=num-1;i++) {
			if(num % i == 0) {
				sum=sum+i;
			}
		}
		return sum;
	}

	public static void main(String[] args) {

		Scanner scanner  = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int number = scanner.nextInt();
		scanner.close();
		// calling the function
		int s = isPerfect(number); 
		if (s  == number) {
			System.out.println(number +" "+ "is Perfect Number");
		} else {
			System.out.println(number +" " + "is not a Perfect Number");
		}

	}

}
