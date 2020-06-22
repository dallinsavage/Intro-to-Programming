/*Dallin Savage
 * 6/22/20
 * sum of two matrices
 */

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
		double matrixSum[][] = addMatrix(matrixA, matrixB);
		System.out.println("The sum of the matrices is:");
		for (int x = 0; x < matrixSum.length; x++) {
			for (int i = 0; i < matrixSum.length; i++) {
				System.out.print(matrixSum[x][i] + " ");
			}
			System.out.println("\n");
		}
	}
			
	public static double[][] addMatrix(double[][] a, double[][] b) {
		double[][] matrixC = new double [3][3];
		for (int x = 0; x < matrixC.length; x++) {
			for (int i = 0; i < matrixC.length; i++) {
				matrixC[i][x] = a[i][x] + b[i][x];
			}
		}
		return matrixC;
	}

}
