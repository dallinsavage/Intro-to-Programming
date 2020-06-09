import java.util.Scanner;

public class Exercise_6_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("enter a number");
		int number = input.nextInt();
		boolean palindrome = isPalindrome(number);
		if (palindrome == true) {
			System.out.println(number + " is a palindrome");
		}
			else {
				System.out.println(number + " is not a palindrome");
			}
		}
		
	public static int reverse(int num) {
		int num1 = num;
		int reversed = 0;
		while (num1 != 0) {
			int digit = num1 % 10;
			reversed = reversed * 10 + digit;
			num1 /= 10;
		}
		return reversed;
	}
	
	public static boolean isPalindrome(int num2) {
		if (reverse(num2) == num2) {
			return true;
		}
		else {
			return false;
		}
	}
}