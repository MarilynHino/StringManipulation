package stringmaipulationexercise;

import java.util.Scanner;

public class LastLetterCoun {

	public static void main(String[] args) {

// - Count all words that ends with 's' in a String and words that ends in 'y' in
		// a String

		// Ask User to enter a sentence
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence");
		String sentence = sc.nextLine().toLowerCase();// GET THE INPUT FROMTHE USER
		String spaceSplit[] = sentence.split(" ");
		int s = 0, sIndex = 0;
		int y = 0, yIndex = 0;

		// ITERATING THROUGH EACH WORD IN THE SENTENCE
		for (int i = 0; i < spaceSplit.length; i++) {
			if (spaceSplit[i].endsWith("s")) {
				sIndex++;

			}
		}
		sc.close();
	}
}