import java.util.Scanner;

public class Salario {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o ID do fucionario: ");
		int numFunc = sc.nextInt();
		System.out.print("Digite o numero de horas trabalhadas: ");
		double horas = sc.nextDouble();
		System.out.print("Digite o valor por hora: ");
		double valorHora = sc.nextDouble();
		
		double salario = horas * valorHora;
		
		System.out.println("\nFuncionario: "+ numFunc);
		System.out.println("Salario: U$ "+ salario);
	}
}
