package math;

import entity.FiguraGeometrica;

public class Triangulo extends FiguraGeometrica {
    private double lado1;
    private double lado2;
    private double lado3;

    public Triangulo(double lado1, double lado2, double lado3) {
        super("Triângulo");
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    @Override
    public double calcArea() {
        double semiPerimetro = calcPerimetro() / 2;
        return Math.sqrt(semiPerimetro * (semiPerimetro - lado1) * (semiPerimetro - lado2) * (semiPerimetro - lado3));
    }

    @Override
    public double calcPerimetro() {
        return lado1 + lado2 + lado3;
    }
}
