package math;

import entity.FiguraGeometrica;

public class Circulo extends FiguraGeometrica {
    private double raio; //mesma coisa do de baixo
    private final double PI = 3.1415; //privado por conta do encapsulamento (so sera usado aqui)

    public Circulo(double raio) {
        super("Círculo");
        this.raio = raio;
    }

    @Override
    public double calcArea() {
        return PI * raio * raio;
    }

    @Override
    public double calcPerimetro() {
        return 2 * PI * raio;
    }
}
