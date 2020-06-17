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
			int z = 1;
			int y = 0;
			if (array[i] != array[z]) {
				newList[y] = array[i];
				z++;
				y++;
			}
			else {
				z++;
			}
		}
/*			int x = 1;
			int counter = 1;
			if (array[i] == array[x]) {
				counter++;
			}
			for (int y = 0; y < array.length - 1; y++) {
				if (counter == 1) {
				newList[y] = array[i];
			}
			}
		}
		*/
		/*		for (int i = 0; i < array.length - 2; i++) {
			int x = 1;
			for (x = 1; x < array.length - 1; x++) {
			if (array[i] == array[i + x]) {
				array[i] = 0;
			}
			}
		}
		for (int y = 0; y < array.length - 1; y++) {
			int z = 0;
			if (array[y] != 0) {
				newList[z] = array[y];
				y++;
			}
}
*/
		return newList;
	}

}
