package com.sample;

public class PalindromeNumber {

	public static void main(String[] args) {

		int n = 121;

		int temp = n;

		int a = 0, b = 0;

		for (int i = 0; i < 3; i++) {

			a = temp % 10;
			b = (b * 10) + a;
			temp = temp / 10;
		}

		if (b == n) {
			System.out.println("Palindrome number :" +b);
		}

		else {
			System.out.println("Not a Palindrome number");
		}
	}
}
