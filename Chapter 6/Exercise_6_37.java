import java.util.Scanner;

public class Exercise_6_37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("enter number");
		int num = input.nextInt();
		System.out.println("enter width");
		int width = input.nextInt();
		String finish = format(num, width);
		System.out.println(finish);
	}
	
	public static String format(int number, int width) {
		int counter = 0;
		String front = "";
		String end = Integer.toString(number);
		while (counter < width) {
			front = front + "0";
			counter++;
		}
		String finish = ( front + end);
		return finish;
	}
}
