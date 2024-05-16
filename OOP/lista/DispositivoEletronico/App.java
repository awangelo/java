import java.util.Scanner;

import entity.Notebook;
import entity.Tablet;
import entity.Smartphone;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Smartphone sm = new Smartphone();
        Notebook nb = new Notebook();
        Tablet tb = new Tablet();

        System.out.println("Selecione um dispositivo: ");
        System.out.println("1 - Notebook");
        System.out.println("2 - Tablet");
        System.out.println("3 - Smartphone");

        switch (sc.nextInt()) {
            case 1:
                nb.getInfo();
                break;
            case 2:
                tb.getInfo();
                break;
            case 3:
                sm.getInfo();
                break;
        }
        sc.close();
    }
}
