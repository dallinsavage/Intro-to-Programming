/*Dallin Savage
 * 6/1/20
 * Interest on an account
 */
import java.util.Scanner;
public class Exercise_2_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter monthley savings");	
		double monthley_savings = input.nextDouble();
		double month_one = monthley_savings * 1.00417;
		double month_two = (month_one + monthley_savings) * 1.00417;
		double month_three = (month_two + monthley_savings) * 1.00417;
		double month_four = (month_three + monthley_savings) * 1.00417;
		double month_five = (month_four + monthley_savings) * 1.00417;
		double month_six = (month_five + monthley_savings) * 1.00417;
		System.out.println("after the sixth month the account value is " + month_six);
	}

}
