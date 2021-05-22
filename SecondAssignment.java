package com.palindrome;

import java.util.Scanner;

/*
 * Create Palindrome class in JAVA and then do the following:
 *	-Ask User to enter a word or create a String variable and assign a word to it
 *	-Reverse a String and check if string is Palindrome
 */
public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word:");
		String origin = sc.next();
		String reverse = "";
		// REVERSE A STRING FROM USER INPUT
		for (int i = origin.length() - 1; i >= 0; i--) {

			reverse += origin.charAt(i);
		}
		// DISPLAY THE REVERSE STRING
		System.out.println(reverse + "Is reverse to " + origin);

		// USING IF-ELSE STATEMENT TO CHECK IF THERE IS A PALINDROME
		if (origin.equals(reverse)) {
			System.out.println(origin + " is a palindrome.");

		} else {
			System.out.println(origin + " is not a palindrome.");
		}

		sc.close();

	}

}
