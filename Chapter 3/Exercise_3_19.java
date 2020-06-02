/*Dallin Savage
 * 6/2
 * Find perimeter of a triangle
 */
import java.util.Scanner;
public class Exercise_3_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter side one");
		double one = input.nextDouble();
		System.out.println("Enter side two");
		double two = input.nextDouble();
		System.out.println("Enter side three");
		double three = input.nextDouble();
		if (((one + two) > three) && ((one + three) > two) && ((two + three) > one)){
			System.out.println("perimeter = " + (one + two + three));
		}
		else {
			System.out.print("Invalid input");
		}
	}	

}
