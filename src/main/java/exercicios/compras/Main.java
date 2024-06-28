package exercicios.compras;

public class Main {
    public static void main(String[] args) {

        Produto produto1 = new Produto("Celular", 15 , 599);
        Produto produto2 = new Produto("HeadFone" , 8  , 349 );
        Produto produto3 = new Produto("Caneta" , 7 , 3.50);
        Produto produto4 = new Produto("Mouse", 3 , 18.75);
        Produto produto5 = new Produto("Escrivaninha" , 4 , 405);
        Produto produto6 = new Produto("Papel Sulfite" , 150 , 26.8);
        Produto produto7 = new Produto("Grampeador" , 45 , 13);
        Produto produto8 = new Produto("Borracha" , 60 , 2.80);
        Produto produto9 = new Produto("Teclado Smart" , 8 , 49.99);
        Produto produto10 = new Produto("Pendrive" , 65 , 62.4);

    Carrinho carrinho = new Carrinho();
    carrinho.adicionarProduto(produto1);
    carrinho.adicionarProduto(produto3);
    carrinho.adicionarProduto(produto7);
    carrinho.adicionarProduto(produto10);

    System.out.println("Produtos no carrinho:");
    carrinho.listarProdutos();

    double total = carrinho.calcularTotal();
    System.out.println("Total de produtos: R$ " + total);
    }


}
