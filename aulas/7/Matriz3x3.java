import java.util.Random;

public class Matriz3x3 {
    public static void main(String[] args) {
		Random rng = new Random();
		
		int[][] matriz = new int[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				matriz[i][j] = rng.nextInt(10);
			}
		}
		
		printMatriz(matriz);
		
		int somaImpar = calcSomaImpar(matriz);
		System.out.println("Soma dos impares: " + somaImpar);
		System.out.println();
		
		System.out.println("Soma de cada coluna:");
		for (int j = 0; j < 3; j++) {
			int somaColuna = calcSomaColuna(matriz, j);
			System.out.println("Coluna " + j + ": " + somaColuna);
		}
		System.out.println();
		
		System.out.println("Soma de cada linha:");
		for (int i = 0; i < 3; i++) {
			int somaLinha = calcSomaLinha(matriz, i);
			System.out.println("Linha " + i + ": " + somaLinha);
		}
		System.out.println();
	}
	
	static void printMatriz(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	static int calcSomaImpar(int[][] matriz) {
		int soma = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] % 2 != 0) {
                    soma += matriz[i][j];
                }
            }
		}
		return soma;
    }
    
    static int calcSomaColuna(int[][] matriz, int coluna) {
        int soma = 0;
        for (int i = 0; i < matriz.length; i++) {
            soma += matriz[i][coluna];
        }
        return soma;
    }
    
    static int calcSomaLinha(int[][] matriz, int linha) {
        int soma = 0;
        for (int j = 0; j < matriz[linha].length; j++) {
			soma += matriz[linha][j];
        }
        return soma;
    }
}
