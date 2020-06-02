/*Dallin Savage
 * 6/1/20
 * Convert celsius to fahrenheit
 */
import java.util.Scanner;

public class Exercise_2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double celsius;
		double fahrenheit;
		System.out.println("Enter a degree in celsius");
		celsius = input.nextDouble();
		fahrenheit = (9.0 / 5) * celsius + 32;
		System.out.println(celsius + " celsius is " + fahrenheit + " fahrenheit");
	}

}
