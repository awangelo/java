package entity;

public abstract class FiguraGeometrica { //nao pode ser instanciada diretamente
    protected String nome;

    public FiguraGeometrica(String nome) {
        this.nome = nome;
    }

    public abstract double calcArea(); //nao tem implementacao aqui
    public abstract double calcPerimetro(); //nao tem implementacao aqui

    public String getNome() {
        return nome;
    }
}
