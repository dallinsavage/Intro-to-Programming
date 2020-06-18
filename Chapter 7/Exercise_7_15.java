/* Dallin Savage
 * 6/18/20
 * eliminate duplicate numbers from an array
 */
import java.util.Scanner;

public class Exercise_7_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 10 numbers seperated by a space");
		int[] list = new int[10];
		int x = 0;
		for (x = 0; x < (list.length); x++) {
			list[x] = input.nextInt();
		}
		int[] finallist = eliminateDuplicates(list);
		System.out.println("Array without duplicates ");
		for (int z = 0;  z < finallist.length; z++) {
			System.out.printf("%d ", finallist[z]);
		}
	}
	
	public static int[] eliminateDuplicates(int[] array) {
		int[] newList = new int[10];
		for (int i = 0; i < array.length - 1; i++) {
			int counter = 1;
			int y = i + 1;
			if (array[i] == array[y]) {
				counter++;
				y++;
			}
			else {
				y++;
			}
		if (counter == 1 && y != array.length) {
				newList[i] = array[i];
		}
		else {
				newList[i] = 0;
		}
					
		}		
		return newList;
	}

}
