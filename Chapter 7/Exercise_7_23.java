
public class Exercise_7_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[] lockers = new boolean[100];
		for (int x = 0; x < lockers.length - 1; x++) {
			if (lockers[0 + x] == true)
				lockers[0 + x] = false;
			else {
				lockers[0 + x] = true;
			}
		}
	}

}
