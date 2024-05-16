package entity;

public class Usuario {
    private String senha;
    private String email = "exemplo@example.com";
    private String nome;

    public void getNome() {
        System.out.println("Nome: " + this.nome);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void getEmail() {
        System.out.println("Email: " + this.email);
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
