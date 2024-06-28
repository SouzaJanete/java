package projetoI;

public abstract class ProdutoBase {
    private String nome;
    private double preco;
    private int quantidade;

    public ProdutoBase() {
        this.nome = "";
        this.preco = 0.0;
        this.quantidade = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public abstract String exibirDetalhes();
}
