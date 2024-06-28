package projetoI;

public class Eletronico extends ProdutoBase {
    public Eletronico(String nome, double preco, int quantidade) {
        super();
        setNome(nome);
        setPreco(preco);
        setQuantidade(quantidade);
    }

    @Override
    public String exibirDetalhes() {
        return "Nome: " + getNome() + ", Preço: " + getPreco() + ", Quantidade: " + getQuantidade();
    }
}

