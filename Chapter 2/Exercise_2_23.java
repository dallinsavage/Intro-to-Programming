/*Dallin Savage
 * 6/1/20
 * Calculate cost of driving
 */
import java.util.Scanner;

public class Exercise_2_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double distance;
		double miles_per_gallon;
		double price;
		System.out.println("Enter driving distance");
		distance = input.nextDouble();
		System.out.println("Enter miles per gallon");
		miles_per_gallon = input.nextDouble();
		System.out.println("Enter price per gallon");
		price = input.nextDouble();
		System.out.println(distance / miles_per_gallon * price);
	}

}
