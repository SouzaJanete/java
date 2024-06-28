package projetoI;

public class Roupa extends ProdutoBase {
    private String tamanho;
    private String cor;

    public Roupa(String nome, double preco, String tamanho, String cor, int quantidade) {
        super();
        setNome(nome);
        setPreco(preco);
        setQuantidade(quantidade);
        this.tamanho = tamanho;
        this.cor = cor;
    }

    @Override
    public String exibirDetalhes() {
        return "Nome: " + getNome() + ", Preço: " + getPreco() + ", Quantidade: " + getQuantidade() + ", Tamanho: " + tamanho + ", Cor: " + cor;
    }
}
