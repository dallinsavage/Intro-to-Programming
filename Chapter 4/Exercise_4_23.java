/*Dallin Savage
 * 6/3/20
 * Payroll
 */
import java.util.Scanner;

public class Exercise_4_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Employee Name");
		String name = input.nextLine();
		System.out.println("Enter number of hours worked");
		double hours = input.nextDouble();
		System.out.println("Enter hourly pay rate");
		double pay_rate = input.nextDouble();
		System.out.println("Enter federal withholding rate");
		double federal_withholding_rate = input.nextDouble();
		System.out.println("Enter state withholding rate");
		double state_withholding_rate = input.nextDouble();
		double gross_pay = hours * pay_rate;
		double federal_withholdings = federal_withholding_rate * gross_pay;
		double state_withholdings = state_withholding_rate * gross_pay;
		double deductions = federal_withholdings + state_withholdings;
		double net_pay = gross_pay - deductions;
		System.out.println("Employee Name: " + name);
		System.out.println("Hours worked: " + hours);
		System.out.println("Pay rate: " + pay_rate);
		System.out.printf("Gross pay: %4.2f\n", + gross_pay);
		System.out.println("Deductions:");
		System.out.printf("    Federal withholdings: %4.2f\n", + federal_withholdings);
		System.out.printf("    State withholdings: %4.2f\n", + state_withholdings);
		System.out.printf("    Total deductions: %4.2f\n", + deductions);
		System.out.printf("Net pay: %4.2f", + net_pay);
	}	

}
