import entity.*;

public class App {
    public static void main(String[] args) throws Exception {
        Flauta flauta = new Flauta();
        Piano piano = new Piano();
        Violao violao = new Violao();
        flauta.afinar();
        flauta.tocarNota();
        piano.afinar();
        piano.tocarNota();
        violao.afinar();
        violao.tocarNota();
    }
}
