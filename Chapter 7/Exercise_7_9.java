/*Dallin Savage
 * 6/15/20
 * find the min of input
 */
import java.util.Scanner;

public class Exercise_7_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 10 numbers seperated by a space");
		double[] list = new double[10];
		int x;
		for (x = 0; x < (list.length - 1); x++); {
			list[x] = input.nextDouble();
		}
	}

}
