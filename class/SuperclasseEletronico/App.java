import entity.Computador;

public class App {
    public static void main(String[] args) throws Exception {
        Computador computador = new Computador();
        System.out.println("Iniciando aplicacao\n");

        computador.ligar();
        computador.computar();
    }
}
