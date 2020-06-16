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
		System.out.println(list);
		int[] finallist = eliminateDuplicates(list);
		System.out.println("Array without duplicates " + finallist);
	}
	
	public static int[] eliminateDuplicates(int[] array) {
		int x = 1;
		int i = 0;
		int y = 0;
		int[] newList = new int[10];
		System.out.println(newList);
		for (i = 0; i < array.length - 1; i++) {
			if (i == x) {
			}
			else if (array[i] == array[x]) {
				newList[x] = -1;
				x++;
			}
			
			if (array[i] != -1) {
				newList[y] = array[i];
				y++;
				
			}
		}
		return newList;
	}

}
