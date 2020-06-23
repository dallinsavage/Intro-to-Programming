/*Dallin Savage
 * 6/22/20
 * state capitals
 */
import java.util.Scanner;

public class Exercise_8_37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String states[][] = new String[10][10];
		states[0][0] = "Alabama";
		states[0][1] = "montgomery";
		states[1][0] = "Alaska";
		states[1][1] = "juneau";
		states[2][0] = "Arizona";
		states[2][1] = "phoenix";
		states[3][0] = "Texas";
		states[3][1] = "austin";
		states[4][0] = "California";
		states[4][1] = "sacramento";
		states[5][0] = "Colorado";
		states[5][1] = "denver";
		states[6][0] = "Conneticut";
		states[6][1] = "hartford";
		states[7][0] = "Delaware";
		states[7][1] = "dover";
		states[8][0] = "Florida";
		states[8][1] = "tallahassee";
		states[9][0] = "Georgia";
		states[9][1] = "atlanta";
		Scanner input = new Scanner(System.in);
		int counter = 0;
		for (int i = 0; i < states.length; i++) {
			System.out.println("What is the capitol of " + states[i][0]);
			String answer = input.next();
			answer = answer.toLowerCase();
			if (answer.equals(states[i][1])) {
				counter ++;
			}
			else {
				
			}
		}
		System.out.println("You got " + counter + " correct");
	}

}
