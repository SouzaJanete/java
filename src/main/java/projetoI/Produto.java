package projetoI;

public class Produto {
    private String tipo;
    private String nome;
    private double preco;
    private int quantidade;

    public Produto (String tipo, String nome, double preco, int quantidade) {
        this.tipo = tipo;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getTipo() {
        return tipo;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }
}
