package projetoI;

import java.util.ArrayList;
import java.util.List;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CarrinhoDeCompras {
    private List<ProdutoBase> itens;

    public CarrinhoDeCompras() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(ProdutoBase produto) {
        this.itens.add(produto);
    }

    public void removerItem(ProdutoBase produto) {
        this.itens.remove(produto);
    }

    public void listarItens() {
        for (ProdutoBase produto : itens) {
            System.out.println(produto.exibirDetalhes());
        }
    }

    public double calcularTotal() {
        double total = 0;
        for (ProdutoBase produto : itens) {
            total += produto.getPreco() * produto.getQuantidade();
        }
        return total;
    }

    public void gerarArquivoTexto(String nomeArquivo) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nomeArquivo))) {
            for (ProdutoBase produto : itens) {
                writer.write(produto.exibirDetalhes());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<ProdutoBase> exportarListaProdutos() {
        return new ArrayList<>(itens);
    }
}
