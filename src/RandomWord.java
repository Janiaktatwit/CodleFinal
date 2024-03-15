import java.util.Random;

public class RandomWord {
	private String word;

	public String getWord() {
		return randomWord();
	}

	public String randomWord() {
		String[] arr1 = { "CODING", "DEBUG", "SYNTAX", "STRING", "METHOD", "MODULE", "BINARY", "BUFFER", "COMPILE",
				"ACCESS" };
		Random rnum = new Random();
		int ranNum = rnum.nextInt((10 - 1) + 1) + 1;

		return arr1[ranNum];
	}
}