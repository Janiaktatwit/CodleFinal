
package codle.v1;

/**
 * Class for creating Guess objects and checking for color based on
 * proximity to the correct answer
 * 
 * @author Gus Cook
 * @author TJ Janiak
 */
public class Guess extends RandomWord {
	
	private String guess;
	private String ans = getWord();
	
	/**
	 * Default constructor
	 * 
	 */
	public Guess() {}
	/**
	 * 1-arg contructor
	 * 
	 * @param s the guessed String
	 */
	public Guess(String s) {
		setGuess(s);
	}
	
	/**
	 * Getter
	 * 
	 * @return guess
	 */
	public String getGuess() {
		return this.guess;
	}
	/**
	 * Setter, changing guess to uppercase
	 * 
	 * @param s guess
	 */
	public void setGuess(String s) {
		this.guess = s.toUpperCase();
	}
	
	/**
	 * Getter for the answer
	 * 
	 * @return the answer
	 */
	public String getAns() {
		return this.ans;
	}

	/**
	 * Check if guess is six letters
	 * 
	 * @return true if six letters, otherwise false
	 */
	public boolean validateLength() {
		if (this.guess.length() == 6) {
			return true;
		}
		return false;
	}
	
	@Override
	public String getWord() {
		return randomWord();
	}

	/**
	 * Gives an int value based on proximity to the answer
	 * 
	 * @param index the index of the String to check
	 * @return the int value based on proximity
	 */
	public int compareLettersTJ( int index) {

		char g = this.guess.charAt(index);
		if (g == this.ans.charAt(index)) { // check if green return
			return 2;
		}

		for (int i = 0; i < this.ans.length(); i++) {
			if (g == this.ans.charAt(i)) {
				return -2;
			}
		}
		return 0;
	}
	
	/**
	 * Checks for a win using recursion
	 * 
	 * @param i the amount of letters in the word minus six
	 * @return true if i reaches the threshold of six, otherwise false
	 */
	public boolean checkWin(int i) {
		if(i==6) {
			return true;
		}
		if(this.guess.charAt(i) != this.ans.charAt(i)){
			return false;
		}
		return checkWin(++i);
	}
	
	/**
	 * Compares the letters and gives Strings representing the color
	 * of the letters
	 * 
	 * @return the String array of colors based on the letters
	 */
	public String[] setColor() {
		String[] color = new String[this.guess.length()];
		for(int i = 0; i < this.guess.length(); i++) {
			int t = compareLettersTJ(i);
			switch(t) {
			case -2:
				color[i]="yellow";
				break;
			case 0:
				color[i]="grey";
				break;
			case 2:
				color[i]="green";	
			}
		}
		return color;
	}
	
	@Override
	public String toString() {
		return this.guess;
	}
}

// end class Guess