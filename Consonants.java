package stringmaipulationexercise;

/*
 * Create Consonants class in JAVA and then do the following:
- Ask User to enter a sentence or create a String variable to assign a sentence to it
- Count all consonants in a String and display the count
- Replace all consonants with '*' in a String
 */

import java.util.Scanner;

public class Consonants {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence");
		String consonant = sc.nextLine();
		int cn = 0;
		for (int i = 0; i < consonant.length(); i++) {

			char cns = consonant.charAt(i);
			if (cns != ' ') {
				if (!(cns == 'a' || cns == 'e' || cns == 'o' || cns == 'i' || cns == 'u')) {
					cn++;
					consonant = consonant.replace(cns, '*');

				}
			}

		}

		System.out.println("The total of consonants are " + cn);
		System.out.print("The consonants are replace with asterisk: " + consonant);
		sc.close();

	}
}
