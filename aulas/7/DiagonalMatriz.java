import java.util.Scanner;
import java.util.Random;

public class DiagonalMatriz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rng = new Random();
		
		System.out.print("Insira o N: ");
		int n = sc.nextInt();
		
		int mat[][] = new int[n][n];
		int diag[] = new int[n];
		int negativos = 0;
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				mat[i][j] = rng.nextInt(21) - 10;
				System.out.print(mat[i][j] + "    ");
				if (i == j) {
					diag[i] = mat[i][j];
				}
				if (mat[i][j] < 0) {
					negativos++;
				}
			}
			System.out.println();
		}
		
		System.out.println("Diagonal principal: ");
		for (int i = 0; i < n; i++) {
			System.out.print(diag[i] + " ");
		}
		System.out.println();

		System.out.println("Negativos: " + negativos);
	}
}
