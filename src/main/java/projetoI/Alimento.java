package projetoI;

public class Alimento extends ProdutoBase {
    private String dataValidade;

    public Alimento(String nome, double preco, String dataValidade, int quantidade) {
        super();
        setNome(nome);
        setPreco(preco);
        setQuantidade(quantidade);
        this.dataValidade = dataValidade;
    }

    @Override
    public String exibirDetalhes() {
        return "Nome: " + getNome() + ", Preço: " + getPreco() + ", Quantidade: " + getQuantidade() + ", Data de Validade: " + dataValidade;
    }
}
