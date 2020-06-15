/*Dallin Savage
 * 6/9/20
 * n by n matrix
 */
import java.util.Scanner;

public class Exercise_6_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter n");
		int n = input.nextInt();
		int counter = 0;
		int counterl = 0;	
			while (counterl < n) {
				int random = (int) (Math.random() * 10);
				if (random >= 5) {
					random = 1;
				}
				else {
					random = 0;
				}
				System.out.printf("%d ", random);
				counter++;
				if (counter == n) {
					System.out.printf("\n");
					counterl++;
					counter = 0;
			}
		}
	}
}
