package proj.arq.model;

public class Cliente {

    private String cpf;
    private String nome;
    private Carrinho carrinho;

    public Cliente(String cpf, String nome, Carrinho carrinho) {
        this.cpf = cpf;
        this.nome = nome;
        this.carrinho = carrinho;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Carrinho getCarrinho() {
        return carrinho;
    }

    public void setCarrinho(Carrinho carrinho) {
        this.carrinho = carrinho;
    }
}
