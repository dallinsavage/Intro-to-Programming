/*Dallin Savage
 * 6/5/20
 * number of vowels and consonants
 */
import java.util.Scanner;

public class Exercise_5_49 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vowel = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a word");
		String word = input.nextLine();
		word = word.toUpperCase();
		while word.< word.length()
		int consonant = (word.length() - vowel);
		if (word.indexOf("A") >= 0) {
			vowel += (word.indexOf("A") + 1);
		}
		if (word.indexOf("E") >= 0) {
			vowel++;
		}
		if (word.indexOf("I") >= 0) {
			vowel++;
		}
		if (word.indexOf("O") >= 0) {
			vowel++;
		}
		if (word.indexOf("U") >= 0) {
			vowel++;
		}
		System.out.println("consonants : " + consonant);
		System.out.println("vowels : " + vowel);
	}

}
