import java.util.Scanner;

public class Areas
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 3 numeros:");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double pi = 3.14159;

        System.out.printf("Triangulo: %.3f\n", a*c/2);
        System.out.printf("Circulo: %.3f\n", pi*c*c);
        System.out.printf("Trapezio: %.3f\n", (a+b)*c/2);
        System.out.printf("Quadrado: %.3f\n", b*b);
        System.out.printf("Retangulo: %.3f\n", a*b);
    }
}