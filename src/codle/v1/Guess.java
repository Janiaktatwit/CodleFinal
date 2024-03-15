
package codle.v1;

/**
 * 
 * @author Gus Cook
 */
public class Guess {
	private String guess;
	private char[] guessArray;
	
	public Guess(String s) {
		this.guess = s;
		this.guessArray = this.guess.toCharArray();
	}
	
	public boolean validateLength() {
		if (this.guess.length() == 6) {
			return true;
		}
		return false;
	}
	
	public boolean compareLetters(char[] c, int index) {
		
		if (this.guessArray[index] == c[index]) {
			return true;
		}
		return false;
	}
	
	public int[] compareLettersGreen(String answer) {
		
		char[] answerA = answer.toCharArray();
		int[] indexes = new int[6];
		
		
		for (int i = 0; i < 6; ++i) {
			if (compareLetters(answerA, i)) {
				indexes[i] = i;
			} else {
				indexes[i] = -1;
			}
		}
		
		return indexes;
	}
	
	public int compareLettersYellow(String answer) {
		
		char[] answerA = answer.toCharArray();
		int count = 0;
		
		if (answer.equals(this.guess)) {
			return 0;
		}
		
		
		return 0;
	}
	
	@Override
	public String toString() {
		return this.guess;
	}

}
   // end class Guess