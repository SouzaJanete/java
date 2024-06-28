package exercicios.sistema_escolar;


import java.util.ArrayList;

public class Turma {
    private String nome;
    private String codigo;
    private ArrayList<Aluno> alunos;


   public Turma(String nome, String codigo) {
        this.nome = nome;
        this.codigo = codigo;
        this.alunos = new ArrayList<>();
    }

    public void addAluno(Aluno aluno) {
        alunos.add(aluno);
    }


    public void listarAlunos() {
        System.out.println("Lista de alunos por turma "  +  nome + " (" + codigo + "):");
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }
    }
}
