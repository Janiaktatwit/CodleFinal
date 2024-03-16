
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
			RandomWord rWord = new RandomWord();
			if(guess.validateLength()) {
			int[] intArr = new int[6];
				for(int i = 0;i<6;i++) {
					intArr[i]=guess.compareLettersTJ("abcdef", i);
				}
				for(int i = 0; i<6;i++) {
					System.out.println(intArr[i]);
				}
				
			}
			
//			if (guess.validateLength()) {
//				System.out.println(guess.compareLettersGreen(answer));
//			} else {
//				System.out.println("Invalid word");
//			}
		}
	}

}
   // end class TestGuess