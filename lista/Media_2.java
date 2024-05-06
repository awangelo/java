import java.util.Scanner;

public class Media_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira 3 numeros: ");
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		double z = sc.nextDouble();
		sc.close();
		
		double media = (x+y+z)/3;
		System.out.printf("Media: %f", media);
	}
}
