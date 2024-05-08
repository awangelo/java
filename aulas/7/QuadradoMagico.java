import java.util.Scanner;

public class QuadradoMagico {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] matriz = new int[3][3];
		System.out.println("Insira os valores para a matriz:");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		sc.close();
		
		if(ehQuadrado(matriz)) {
			System.out.println("Eh um quadado magico");
		}
		else {
			System.out.println("Nao eh um quadrado magico");
		}
	}
	
	static boolean ehQuadrado(int[][] matriz) {
		int somaPrimaria = 0, somaSecundaria = 0;
		
		for (int i = 0; i < matriz.length; i++) {
			somaPrimaria += matriz[i][i];
			somaSecundaria += matriz[i][matriz.length - 1 - i];
		}
		
		for (int i = 0; i < matriz.length; i++) {
			int somaLinha = 0, somaColuna = 0;
			
			for (int j = 0; j < matriz[i].length; j++) {
				somaLinha += matriz[i][j];
				somaColuna += matriz[j][i];
			}
			if (somaLinha != somaPrimaria || somaColuna != somaSecundaria) {
				return false;
			}
		}
		
		return true;
	}
}
