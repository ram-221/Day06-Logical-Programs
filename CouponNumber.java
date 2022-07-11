package com.logicalprogramsday05;
import java.util.Scanner;

public class CouponNumber {
	public static int Coupon(int number) {
		return (int) (Math.random() * number);
	}

	public static void TotalRandomNumber(int number) {

		boolean[] collect = new boolean[number];// collect[i] = true if card type i already collected
		int count = 0;
		int notSame = 0;
		// for number of cards you collect before obtaining one of each of the n types
		while (notSame < number) {
			int card = Coupon(number);
			count++;
			if (!collect[card]) {
				notSame++;
				collect[card] = true;
			}
		}
		System.out.println("Total Random Numbers needed: " + count);
	}

	public static void main(String[] args) {
		System.out.println("Enter a card Number to Draw: ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		scanner.close();
		TotalRandomNumber(number);

	}

}


