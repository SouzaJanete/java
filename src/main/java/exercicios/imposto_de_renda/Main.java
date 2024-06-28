package exercicios.imposto_de_renda;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Janete Souza", 2406);
        Pessoa pessoa2 = new Pessoa("Wolney Souza", 12300);
        Pessoa pessoa3 = new Pessoa("Caio Rodrigues", 4300);
        Pessoa pessoa4 = new Pessoa("Micaela Ferreira", 7780);
        Pessoa pessoa5 = new Pessoa("Vicente Leonan", 400);

        ImpostoDeRenda impostoDeRenda1 = new ImpostoDeRenda(pessoa1);
        ImpostoDeRenda impostoDeRenda2 = new ImpostoDeRenda(pessoa2);
        ImpostoDeRenda impostoDeRenda3 = new ImpostoDeRenda(pessoa3);
        ImpostoDeRenda impostoDeRenda4 = new ImpostoDeRenda(pessoa4);
        ImpostoDeRenda impostoDeRenda5 = new ImpostoDeRenda(pessoa5);

        impostoDeRenda1.imprimir();
        impostoDeRenda2.imprimir();
        impostoDeRenda3.imprimir();
        impostoDeRenda4.imprimir();
        impostoDeRenda5.imprimir();


    }
}
