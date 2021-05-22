package com.string.manipulation;

/* Assignment 1: due 05/21/21 @01:59am
 * author@ Marilyn Hinojosa
 * 
 * Create Vowels class in JAVA then do the following:
 *	-Ask User to enter a sentence or create a String variable to assign a sentence to it
 *	-Count all the vowels in a sentence and display the count
 * 
 */
import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence, it might contain more than one word");
		String string = sc.nextLine();

		for (int i = 0; i < string.length(); i++) {
			System.out.println("Letter " + (i + 1) + ":" + string.charAt(i));
		}

		System.out.println("You sentence has " + string.length() + " Characters");

		sc.close();

	}

}