import java.util.Scanner;

public class Atv3 {
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
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i = 2, cont = 0;
		
		System.out.print("Insira o n: ");
		int n = sc.nextInt();
		int ele[] = new int[n];
		
        while (cont < n) {
            if (ehPrimo(i)) {
                ele[cont] = i;
                cont++;
            }
            i++;
        }
        
        for (int j = 0; j < n; j++) {
            System.out.print(ele[j]+" ");
        }

	}
}
