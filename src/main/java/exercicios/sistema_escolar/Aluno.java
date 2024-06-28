package exercicios.sistema_escolar;

public class Aluno {
    private String nome;
    private int matricula;
    private int idade;

    public Aluno(String nome, int matricula, int idade) {
    this.nome = nome;
    this.matricula = matricula;
    this.idade = idade;

    }



    @Override
    public String toString() {
        return "Aluno "  +  nome + ", matricula='" + matricula + '\'' +
                ", idade=" + idade;
    }
}

