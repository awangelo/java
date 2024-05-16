import math.Quadrado;
import math.Circulo;
import math.Triangulo;

public class App {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado(5);
        Circulo circulo = new Circulo(3);
        Triangulo triangulo = new Triangulo(3, 4, 5);

        System.out.println("Area do " + quadrado.getNome() + ": " + quadrado.calcArea());
        System.out.println("Perimetro do " + quadrado.getNome() + ": " + quadrado.calcPerimetro());
        System.out.println("Area do " + circulo.getNome() + ": " + circulo.calcArea());
        System.out.println("Perimetro do " + circulo.getNome() + ": " + circulo.calcPerimetro());
        System.out.println("Area do " + triangulo.getNome() + ": " + triangulo.calcArea());
        System.out.println("Perimetro do " + triangulo.getNome() + ": " + triangulo.calcPerimetro());
    }
}
