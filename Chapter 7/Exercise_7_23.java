/* DallinSavage
 * 6/19/20
 * open lockers
 */
public class Exercise_7_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[] lockers = new boolean[100];
		for (int i = 0; i < lockers.length - 1; i++) {
			for (int x = 0; x < lockers.length - 1; x += x) {
			if (lockers[i + x] == true) {
				lockers[i + x] = false;
				x =+ x;
			}
			else {
				lockers[i + x] = true;
			}
		}
	}
		System.out.println(" lockers that are open:");
		int counter = 0;
		for (int y = 0; y < lockers.length - 1; y++) {
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
