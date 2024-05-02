import java.util.Scanner;

public class Quadrante {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de x: ");
        double x = sc.nextDouble();

        System.out.print("Digite o valor de y: ");
        double y = sc.nextDouble();
        sc.close();
        
        if (x == 0 && y ==0)
		{
			System.out.printf("\nOrigem");
		}
		else if (x == 0)
		{
			System.out.printf("\nEixo X");
		}
		else if (y == 0)
		{
			System.out.printf("\nEixo Y");
		}
		
		if (x > 0 && y > 0)
		{
			System.out.printf("\nQ1");
		}
		else if (x < 0 && y > 0) {
            System.out.println("\nQ2");
        }
        else if (x < 0 && y < 0) {
            System.out.println("\nQ3");
        }
        else {
            System.out.println("\nQ4");
        }
    }
}
