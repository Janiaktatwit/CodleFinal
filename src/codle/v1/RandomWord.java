
package codle.v1;

import java.util.Random;

/**
 * Class for obtaining a random word from the matrix of words
 * 
 * @author Gus Cook
 * @author TJ Janiak
 */
public abstract class RandomWord {

	/**
	 * Get a word
	 * 
	 * @return the word being obtained
	 */
	public abstract String getWord();

	/**
	 * Returns a random word from the matrix
	 * 
	 * @return a random word
	 */
	public static String randomWord() {
		
		String[] arr1 = { "CODING", "DOUBLE", "SYNTAX", "STRING", 
							"METHOD", "MODULE", "BINARY", "BUFFER", 
							"EASTER", "ACCESS" };
		
		String[] arr2 = {"BUGGED", "JAVAFX", "PUBLIC", "STATIC",
							"IMPORT", "RETURN", "GITHUB", "EXTEND",
							"COMMIT", "LAMBDA"};
		
		String[] arr3 = {"ASSERT", "VECTOR", "OUTPUT", "MEMORY", "DEBUGS", 
							"SWITCH", "ACCESS", "SOCKET", "EXPORT", "CLIENT"};
		
		String[] arr4 = {"LOGGER", "KERNEL", "SOURCE", "OBJECT", "ACTION",
							"METRIC", "GLOBAL", "DEFINE", "STREAM", "RANDOM"};
		
		String[][] arrMatrix = {arr1, arr2, arr3, arr4};
		
		Random rnum = new Random();
		int ranNum = rnum.nextInt(10);
		int ranPlace = rnum.nextInt(arrMatrix.length);

		
		return arrMatrix[ranPlace][ranNum];
		
	}
	
}