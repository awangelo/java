import java.util.Scanner;

public class Juros_13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira o periodo: ");
		double periodo = sc.nextInt();
		System.out.print("Insira a taxa de juros (porcentagem): ");
		double juros = sc.nextDouble() / 100;
		System.out.print("Insira o valor principal ");
		double principal = sc.nextDouble();
		
		System.out.print("Montante final: " + calc(principal, juros, periodo));
	}
	
	static double calc(double prin, double juros, double per) {
		double montante = prin * (1 + juros * per);
		return montante;
	}
}
