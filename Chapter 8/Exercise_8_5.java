import java.util.Scanner;

public class Exercise_8_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double[][] matrixA = new double[3][3];
		System.out.println("enter 3 by 3 matrix 1");
		for (int row = 0; row < matrixA.length; row++) {
			for (int column = 0; column < matrixA[row].length; column++) {
				matrixA[row][column] = input.nextDouble();
			}
		}
		double[][] matrixB = new double[3][3];
		System.out.println("enter 3 by 3 matrix 2");
		for (int row = 0; row < matrixB.length; row++) {
			for (int column = 0; column < matrixB[row].length; column++) {
				matrixB[row][column] = input.nextDouble();
			}
		}
	public static double[][] addMatrix(double[][] a, double[][] b) {
		
	}

}
}