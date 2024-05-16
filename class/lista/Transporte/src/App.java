import entity.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Escolha o veiculo");
        System.err.println("1 - Carro");
        System.err.println("2 - Moto");
        System.err.println("3 - Caminhao");

        switch (sc.nextInt()) {
            case 1:
                Carro carro = new Carro();
                carro.ligarFarol();
                carro.acelerar();
                System.out.print("Digite a direcao para virar: ");
                carro.virar(sc.next());
                carro.frear();
                break;
            case 2:
                Moto moto = new Moto();
                moto.acelerar();
                moto.darGrau();
                System.out.print("Digite a direcao para virar: ");
                moto.virar(sc.next());
                moto.frear();
                break;
            case 3:
                Caminhao caminhao = new Caminhao();
                caminhao.verificarRodas();
                caminhao.acelerar();
                System.out.print("Digite a direcao para virar: ");
                caminhao.virar(sc.next());
                caminhao.frear();
                break;
            default:
                break;
        }
        sc.close();
    }
}
