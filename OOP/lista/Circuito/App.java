import entity.CircuitoEletronico;

public class App {
    public static void main(String[] args) throws Exception {
        CircuitoEletronico CE = new CircuitoEletronico(5, 10);
        System.out.println("Circuito Eletronico: " + CE.getCorrente() + "A, " + CE.getTensao() + "V");
        System.out.println("Resistencia: " + CE.calcResistencia());
        System.out.println("Potencia: " + CE.calcPotencia());
    }
}
