import entity.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha uma forma:");
        System.out.println("1 - Quadrado");
        System.out.println("2 - Triangulo");
        System.out.println("3 - Circulo");
        switch (sc.nextInt()) {
            case 1:
                Quadrado quadrado = new Quadrado();
                System.out.println("Area: " + quadrado.calcArea(6, 6));
                System.out.println("Perimetro: " + quadrado.calcPerim(6, 6));
                break;
            case 2:
                Triangulo triangulo = new Triangulo();
                System.out.println("Area: " + triangulo.calcArea(5, 5));
                System.out.println("Perimetro: " + triangulo.calcPerim(5, 5));
                break;
            case 3:
                Circulo circulo = new Circulo();
                System.out.println("Area: " + circulo.calcArea(5, circulo.PI));
                System.out.println("Perimetro: " + circulo.calcPerim(3, circulo.PI));
                break;
            default:
                break;
        }
        sc.close();
    }
}
