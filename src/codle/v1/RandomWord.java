
package codle.v1;

import java.util.Random;

public class RandomWord {
	private String word;

	public String getWord() {
		return randomWord();
	}

	public String randomWord() {
		
		String[] arr1 = { "CODING", "DOUBLE", "SYNTAX", "STRING", 
							"METHOD", "MODULE", "BINARY", "BUFFER", 
							"COMPILE", "ACCESS" };
		
		String[] arr2 = {"BUGGED", "JAVAFX", "PUBLIC", "STATIC",
							"IMPORT", "RETURN", "GITHUB", "EXTEND",
							"COMMIT", "LAMBDA"};
		
		Random rnum = new Random();
		int ranNum = rnum.nextInt(10);

		if (rnum.nextInt(2) == 1) {
			return arr1[ranNum];
		} 
		
		return arr2[ranNum];
		
	}
}