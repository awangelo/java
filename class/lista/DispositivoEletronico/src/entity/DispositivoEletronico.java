package entity;

public class DispositivoEletronico {
    public String utiliza = "Eletricidade";
    public String marca;
    public int anoFabricacao;

    public void getSpecs() {
        System.out.println("Marca: " + this.marca);
        System.out.println("Ano de Fabricação: " + this.anoFabricacao);
    }
}
