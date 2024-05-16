package entity;

public class Triangulo implements FormaGeometrica {

    public double calcArea(double base, double altura) {
        return (base * altura) / 2;
    }

    public double calcPerim(double base, double altura) {
        return (base + altura) * 2;
    }
}
