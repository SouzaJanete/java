package exercicios.compras;

import java.util.ArrayList;

public class Carrinho {
    private ArrayList<Produto> produtos;

    public Carrinho() {
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void listarProdutos() {
        for (Produto produto : produtos) {
            System.out.println("Produto: " + produto.getNome()  +  " Quantidade: " + produto.getQuantidade() + ",Subtotal: R$ " + produto.getSubTotal());
        }
    }

    public double calcularTotal() {
        double total = 0;
        for (Produto produto : produtos) {
            total += produto.getSubTotal();
        }
        return total;
    }
}