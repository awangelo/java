package entity;

public class Quadrado implements FormaGeometrica {
    
    public double calcArea(double l1, double l2) {
        return l1 * l2;
    }

    public double calcPerim(double l1, double l2) {
        return 4 * l1;
    }
}
