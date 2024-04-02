
package codle.v1;

/**
 * 
 * @author Gus Cook
 */
public class Guess extends RandomWord {
	private String guess;
	private char[] guessArray;
	private String ans = getWord();
	
	public Guess() {}
	
	public String getGuess() {
		return this.guess;
	}
	public void setGuess(String s) {
		this.guess = s.toUpperCase();
	}
	
	public String getAns() {
		return this.ans;
	}

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
	
	public boolean checkWin(int i) {
		if(i==6) {
			return true;
		}
		if(this.guess.charAt(i) != this.ans.charAt(i)){
			return false;
		}
		return checkWin(++i);
	}
	
	public String[] setColor() {
		String[] color = new String[this.guess.length()];
		for(int i = 0;i<this.guess.length();i++) {
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