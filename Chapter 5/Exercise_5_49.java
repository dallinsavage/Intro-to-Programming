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
		int position = 0;
		System.out.println(position);
		while (position < word.length()) {
			char letter = word.charAt(position);
			
			if (letter == 'A') {
				vowel++;
		}
			else if (letter == 'E') {
				vowel++;
			}
			else if (letter == 'I') {
				vowel++;
			}
			else if (letter == 'O') {
				vowel++;
			}
			else if (letter == 'U') {
				vowel++;
			}
		position++;
		}
		int consonant = (word.length() - vowel);
		System.out.println("consonants : " + consonant);
		System.out.println("vowels : " + vowel);
	}
}
