package exercicios.healthCare;

public class Main {
    public static void main(String[] args) {
        Paciente paciente1 = new Paciente("Ana Maria" , 15, 48, 1.62);
        Paciente paciente2 = new Paciente("Joaquim Santos" , 18, 69, 1.70);
        Paciente paciente3 = new Paciente("Bernardo" , 23, 55, 1.66);
        Paciente paciente4 = new Paciente("Juliana" , 21 , 68, 1.67);
        Paciente paciente5 = new Paciente("Jurema" , 39, 79, 1.71);


        imprimirDiagnostico(paciente1);
        imprimirDiagnostico(paciente2);
        imprimirDiagnostico(paciente3);
        imprimirDiagnostico(paciente4);
        imprimirDiagnostico(paciente5);
    }

    protected static void imprimirDiagnostico(Paciente paciente) {
        double imc = paciente.calcularIMC();
        String diagnostico = paciente.diagnostico();
        System.out.println("O diagnóstico do paciente " + paciente.getNome() + " é " + diagnostico + "(IMC = " + imc + ")");
    }
}
