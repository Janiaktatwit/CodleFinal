
package codle.v1;

import java.util.Scanner;

/**
 * 
 * @author Gus Cook
 */
public class TestGuess {
	public static void main(String[] args) {
		String answer = "coding";

		try (Scanner input = new Scanner(System.in);) {
//			Guess g = new Guess("STRING");
//			String[] c = g.setColor();
//			for(int i = 0; i<c.length;i++) {
//				System.out.printf("%s ", c[i]);
//			}
			
			for (int z = 0; z < 6; z++) {
				System.out.print("\nEnter a six-letter word: ");
				Guess guess = new Guess();
				guess.setGuess(input.nextLine());

				String[] c = guess.setColor();
				for (int i = 0; i < c.length; i++) {
					System.out.printf("%s ", c[i]);
				}
			}
		}
	}
}