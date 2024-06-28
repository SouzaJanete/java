package exercicios.biblioteca;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Biblioteca lerParaCrescer = new Biblioteca();

        Livro livro = new Livro("O Caçador de Pipas", "Khaled Hosseini", 2007);
        Livro livro1 = new Livro("Filhos Intelgentes Enriquecem Sozinhos", "Gustavo Cerbasi", 2024);
        Livro livro2 = new Livro("Ohomem mais inteligente da história", "Augusto Cury", 2020);
        Livro livro3 = new Livro("Todas as suas perfeições", "Cooleen Hoover", 2019);
        Livro livro4 = new Livro("Antes que o café esfrie", "Toshikazu Kawagughi", 2022);

        lerParaCrescer.addLivro(livro);
        lerParaCrescer.addLivro(livro1);
        lerParaCrescer.addLivro(livro2);
        lerParaCrescer.addLivro(livro3);
        lerParaCrescer.addLivro(livro4);

        lerParaCrescer.listarLivros();

    }
}
