
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
			System.out.print("Enter a six-letter word: ");
			Guess guess = new Guess(input.nextLine());
			if (guess.validateLength()) {
				System.out.println(guess.compareLettersGreen(answer));
			} else {
				System.out.println("Invalid word");
			}
		}
	}

}
   // end class TestGuess