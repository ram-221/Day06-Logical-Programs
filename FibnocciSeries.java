package com.logicalprogramsday05;
import java.util.Scanner;
public class FibnocciSeries {
	
	public static void printFibnocci(int number) {
		int firstTerm = 0, secondTerm = 1, finalTerm = 0;
		System.out.println(firstTerm+" "+ secondTerm + " ");
		for(int i=2 ;i<=number; i++) {
			finalTerm=firstTerm + secondTerm;
			System.out.println(finalTerm+" ");
			firstTerm=secondTerm;
			secondTerm=finalTerm;
		}
	}

	public static void main(String[] args) {
		
		Scanner read=new Scanner(System.in);
		System.out.println("Enter the value: ");
		int number=read.nextInt();
		read.close();
		System.out.println("FibnocciSeries: ");
		printFibnocci(number);
		
	}

}
