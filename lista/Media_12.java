import java.util.Scanner;

public class Media_12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira uma nota e o peso: ");
		double nota1 = sc.nextDouble();
		int p1 = sc.nextInt();
		System.out.print("Insira uma nota e o peso: ");
		double nota2 = sc.nextDouble();
		int p2 = sc.nextInt();	
		System.out.print("Insira uma nota e o peso: ");
		double nota3 = sc.nextDouble();
		int p3 = sc.nextInt();
		sc.close();
		
		System.out.println("Media: " + (nota1*p1 + nota2*p2 + nota3*p3)/(p1+p2+p3));
	}
	
}
