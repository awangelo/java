package math;

import entity.FiguraGeometrica;

public class Quadrado extends FiguraGeometrica {
    private double lado;

    public Quadrado(double lado) {
        super("Quadrado"); // chamando o construtor da superclasse
        this.lado = lado;
    }

    @Override
    public double calcArea() {
        return lado * lado;
    }

    @Override
    public double calcPerimetro() {
        return 4 * lado;
    }
}
