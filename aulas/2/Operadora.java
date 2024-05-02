import java.util.Scanner;

public class Operadora {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Minutos consumidos: ");
		
		double basico = 50.00, precoFinal = 0.00, min = sc.nextDouble();
		
		if (min>=100)
		{
			precoFinal = basico + ((min - 100) * 2);
		}
		else
		{
			precoFinal = basico;
		}
		System.out.println("Valor a pagar: R$"+precoFinal);
	}
}
