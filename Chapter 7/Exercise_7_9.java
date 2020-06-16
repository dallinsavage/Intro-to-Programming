/*Dallin Savage
 * 6/15/20
 * find the min of input
 */
import java.util.Scanner;
import java.util.Arrays;

public class Exercise_7_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 10 numbers seperated by a space");
		double[] list = new double[10];
		int x = 0;
		for (x = 0; x < (list.length); x++) {
			list[x] = input.nextDouble();
		}
		double minimum = min(list);
		System.out.println("The minimum number is " + minimum);	
	}
		
public static double min(double[] array) {
	java.util.Arrays.parallelSort(array);
	return array[0];
	}

}
