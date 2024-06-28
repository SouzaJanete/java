package exercicios.sistema_escolar;


public class Main {
    public static void main(String[] args) {
        Turma turmaA = new Turma("Turma A", "1A");
        Turma turmaB = new Turma("Turma B", "2B");
        Turma turmaC = new Turma("Turma C", "3C");

        Aluno aluno = new Aluno("Ana Maria Lopes", 0015, 15);
        Aluno aluno1 = new Aluno("Bruno Pereira", 50, 13);
        Aluno aluno2 = new Aluno("João Santana", 0015, 16);
        Aluno aluno3 = new Aluno("Priscila Alcantara", 0025, 16);
        Aluno aluno4 = new Aluno ("Tadeu Smith", 18, 15);
        Aluno aluno5 = new Aluno("Zacarias Didi", 98, 16);
        Aluno aluno6 = new Aluno("Diana Dourado", 158, 18);
        Aluno aluno7 = new Aluno("Micaela Souza", 784, 15);
        Aluno aluno8 = new Aluno("Caio Gabriel", 698, 18);
        Aluno aluno9 = new Aluno("Vicente Souza", 96, 15);
        Aluno aluno10 = new Aluno("Wolney Leonan", 92, 19);


        //Turma A

        turmaA.addAluno(aluno1);
        turmaA.addAluno(aluno7);
        turmaA.addAluno(aluno9);


        //Turma B
        turmaB.addAluno(aluno);
        turmaB.addAluno(aluno2);
        turmaB.addAluno(aluno5);
        turmaB.addAluno(aluno4);

        //Turma C
        turmaC.addAluno(aluno3);
        turmaC.addAluno(aluno6);
        turmaC.addAluno(aluno8);
        turmaC.addAluno(aluno10);

        turmaA.listarAlunos();
        turmaB.listarAlunos();
        turmaC.listarAlunos();

    }
}
