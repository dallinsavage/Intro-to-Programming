 /*Dallin Savage
  * 6/5/20
  * Divisible  by 5 of 6 but not both
  */

public class Exercise_5_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 100;
		int counter = 0;
		while (x >= 100 && x <= 200) {
			if (x % 5 == 0 ^ x % 6 == 0) {
					System.out.printf("%d ", x);
					counter++;
				}
			x++;
			if (counter == 10) {
				System.out.printf("\n");
				counter = 0;
			}
			}
			
		}
				
	}
