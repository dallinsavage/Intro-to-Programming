/*Dallin Savage
 * 6/2/20
 * Area of a pentagon
 */
import java.util.Scanner;
public class Exercise_4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter length from the center to a vertex");
		double r = input.nextDouble();
		double s = (2 * r) * (Math.sin(Math.PI / 5));
		double area = (5 * (s * s)) / (4 * Math.tan(Math.PI / 5));
		System.out.println("The area of the pentagon is " + area);
	}

}
