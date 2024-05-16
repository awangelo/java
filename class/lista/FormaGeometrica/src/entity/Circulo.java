package entity;

public class Circulo implements FormaGeometrica {
    public final double PI = 3.1415;

    public double calcArea(double raio, double PI) {
        return PI * raio * raio;
    }

    public double calcPerim(double raio, double PI) {
        return 2 * PI * raio;
    }
}
