/*Dallin Savage
 * 6/2/20
 * Solve linear equation
 */
import java.util.Scanner;
public class Exercise_3_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner input = new Scanner(System.in);
	System.out.println("Enter Values in order a,b,c,d,e,f");
	double a = input.nextDouble();	
	double b = input.nextDouble();
	double c = input.nextDouble();
	double d = input.nextDouble();
	double e = input.nextDouble();
	double f = input.nextDouble();
	if (((a * d) - (b * c)) == 0) {
		System.out.println("The equation has no solution");
		}
	else {
		double x = (((e * d) - (b * f)) / ((a * d) - (b * c)));
		double y = (((a * f) - (e * c)) / ((a * d) - (b * c)));
		System.out.println("x = " + x);
		System.out.println("y = " + y);
	}
	}

}
