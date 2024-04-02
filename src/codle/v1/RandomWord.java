
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