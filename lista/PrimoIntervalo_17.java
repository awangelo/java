import java.util.Scanner;

public class PrimoIntervalo_17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira o inicio do intervalo: ");
		int inicio = sc.nextInt();
		System.out.print("Insira o fim do intervalo: ");
		int fim = sc.nextInt();
		sc.close();
		
		if (inicio <= 0 || fim == 1) {
			System.out.println("Insira valores validos");
		}
		for (int i = inicio; i <= fim; i++) {
			if (ehPrimo(i)) {
				System.out.print(i + " ");
			}
		}
	}
	
	static boolean ehPrimo(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
