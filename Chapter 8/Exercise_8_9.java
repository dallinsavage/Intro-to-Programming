import java.util.Scanner;

public class Exercise_8_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String game[][] = new String[3][3];
		game[0][0] = "   ";
		game[0][1] = "   ";
		game[0][2] = "   ";
		game[1][0] = "   ";
		game[1][1] = "   ";
		game[1][2] = "   ";
		game[2][0] = "   ";
		game[2][1] = "   ";
		game[2][2] = "   ";
		Scanner input = new Scanner(System.in);
		boolean playing = true;
		int row = 0;
		int column = 0;
		while (playing == true) {
			boolean xTurn = true;
			while (xTurn == true) {
				System.out.println("Enter a row (0, 1, 2) for player X");
				row = input.nextInt();
				System.out.println("Enter a column (0, 1, 2) for player X");
				column = input.nextInt();
				if (game[row][column] != "   ") {
					System.out.println("Space is already taken");
				}
				else {
				game[row][column] = "X  ";
				}
				xTurn = false;
			}
			while (xTurn == false) {
				System.out.println("Enter a row (0, 1, 2) for player O");
				row = input.nextInt();
				System.out.println("Enter a column (0, 1, 2) for player O");
				column = input.nextInt();
				if (game[row][column] != "   ") {
					System.out.println("Space is already taken");
				}
				else {
				game[row][column] = "O  ";
				}
				xTurn = true;
			}
			for (int i = 0; i < game.length; i++) {
				for (int z = 0; z < game.length; z++) {
					System.out.printf("%s",game[i][z]);
				}
				System.out.println("\n");
			}
		}
	}

}
