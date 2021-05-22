package com.words;

import java.util.Scanner;

/* Assignment is due 05/21/2021
 * @author Marilyn Hinojosa
 * 
 * Ask User to enter a sentence or create a String variable to assign a sentence to it
 *	- Count all Words in a String and display the count
 *	- Display the count of word in a sentence
 * 
 */
public class Words {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence");
		String sentence = sc.nextLine();
		int count = 1;
		for (int i = 0; i < sentence.length(); i++) {
			if ((sentence.charAt(i) == (' ')) && (sentence.charAt(i + 1) != ' ')) {
				count++;

			}
		}

		System.out.println("Total of words in this sentence are:" + count);

		sc.close();

	}
}