/* DallinSavage
 * 6/19/20
 * open lockers
 */
public class Exercise_7_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[] lockers = new boolean[100];
		for (int z = 0; z < lockers.length; z++) {
			lockers[z] = true;
		}
		for (int i = 1; i < lockers.length; i++) {
			for (int x = i; x < lockers.length; x++) {
				if (lockers[0 + x] == true) {
				lockers[0 + x] = false;
				x += i;
			}
			else {
				lockers[0 + x] = true;
				x += i;
			}
		}
	}
		System.out.println(" lockers that are open:");
		int counter = 1;
		for (int y = 0; y < lockers.length; y++) {
			if (lockers[y] == true) {
				System.out.println(counter);
				counter++;
			}
			else {
				counter++;
			}
		}
	}
}
