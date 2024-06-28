package projetoI;

public class Main {
    public static void main(String[] args) {
        // Criando primeira instância de CarrinhoDeCompras
        CarrinhoDeCompras carrinho1 = new CarrinhoDeCompras();
        carrinho1.adicionarItem(new Eletronico("Smartphone", 2999.0, 12));
        carrinho1.adicionarItem(new Roupa("T-Shirt", 89.99, "M", "Preto", 6));
        carrinho1.adicionarItem(new Alimento("Arroz", 9.99, "2024-12-31", 4));

        // Listando produtos do primeiro carrinho
        System.out.println("Itens do Carrinho 1:");
        carrinho1.listarItens();
        System.out.println("Total do Carrinho 1: " + carrinho1.calcularTotal());

        // Gerando arquivo de texto para o primeiro carrinho
        carrinho1.gerarArquivoTexto("carrinho1.txt");

        // Criando segunda instância de CarrinhoDeCompras com mais itens
        CarrinhoDeCompras carrinho2 = new CarrinhoDeCompras();
        carrinho2.adicionarItem(new Eletronico("Notebook", 4999.0, 24));
        carrinho2.adicionarItem(new Roupa("Calça Jeans", 199.99, "G", "Azul", 2));
        carrinho2.adicionarItem(new Alimento("Feijão", 5.99, "2025-01-15", 10));

        // Listando produtos do segundo carrinho
        System.out.println("\nItens do Carrinho 2:");
        carrinho2.listarItens();
        System.out.println("Total do Carrinho 2: " + carrinho2.calcularTotal());

        // Gerando arquivo de texto para o segundo carrinho
        carrinho2.gerarArquivoTexto("carrinho2.txt");
    }
}
