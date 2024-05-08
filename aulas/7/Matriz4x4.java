import java.util.Random;

public class Matriz4x4 {
    public static void main(String[] args) {
		Random rng = new Random();
		
		double[][] matriz = new double[4][4];
		double[][] matrizTrans = new double[4][4];
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				matriz[i][j] = rng.nextDouble() * 10;
			}
		}
		
		printMatriz(matriz);
		System.out.println();
		
		System.out.println("Diagonal principal: ");
		diagonalPrincipal(matriz);
		System.out.println();
		
		System.out.println("Diagonal secundaria: ");
		diagonalSecundaria(matriz);
		System.out.println();
		
		System.out.println();
		System.out.println("Matriz transposta: ");
		matTransposta(matriz, matrizTrans);
	}
	
	static void printMatriz(double[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.printf("%.1f\t", matriz[i][j]);
			}
			System.out.println();
		}
	}
	
	static void diagonalPrincipal(double[][] matriz) {
		for (int i = 0; i < 4; i++) {
			System.out.printf("%.1f   ", matriz[i][i]);
		}
    }
    
    static void diagonalSecundaria(double[][] matriz) {
		for (int i = 0; i < 4; i++) {
			System.out.printf("%.1f   ", matriz[i][3 - i]);
		}
    }
    
    static void matTransposta(double[][] matriz, double[][] matrizTrans) {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				matrizTrans[j][i] = matriz[i][j];
			}
		}
		printMatriz(matrizTrans);
    }
}
