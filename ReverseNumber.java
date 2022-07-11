package com.logicalprogramsday05;
import java.util.Scanner;
public class ReverseNumber {
	
	public static void Reverse(int number){
		int reverse = 0;
		while (number != 0) {
			int remainder = number % 10;
			reverse = reverse * 10 + remainder;
			number = number / 10;
		}
		System.out.println("The reverse of the given number is: " +reverse);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = scanner.nextInt();
		scanner.close();
		Reverse(number);
		
	}

}
