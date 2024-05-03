import java.util.Scanner;

public class MetodoMultiplicacao {
	
	static int times(int numero1, int numero2) {
		int resultado = numero1 * numero2;
		return resultado;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira dois numeros: ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		System.out.println("Resultado: " + times(x, y));
	}
}
