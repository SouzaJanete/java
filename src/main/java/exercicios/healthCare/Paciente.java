package exercicios.healthCare;

public class Paciente {
    private String nome;
    private int idade;
    private double peso;
    private double altura;

    public Paciente(String nome, int idade, double peso, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calcularIMC() {
        return peso/(altura*altura);
    }

    public String diagnostico() {
        double imc = calcularIMC();
        if (imc < 16) {
            return "Baixo peso muito grave = IMC abaixo de 16 kg/m²";
        } else if (imc >= 16 && imc < 16.99) {
            return "Baixo peso grave = IMC entre 16 e 16,99 kg/m²";

        } else if (imc >= 17 && imc < 18.49) {
            return "Baixo peso = IMC entre 17 e 18,49 kg/m²";
        } else if (imc >= 18.50 && imc < 24.99) {
            return "Peso normal = IMC entre 18,50 e 24,99 kg/m²";
        } else if (imc >= 25 && imc < 29.99) {
            return "Sobrepeso = IMC entre 25 e 29,99 kg/m²";
        } else if (imc >= 30 && imc < 34.99) {
            return "Obesidade grau I = IMC entre 30 e 34,99 kg/m²";
        } else if (imc >= 35 && imc < 39.99) {
            return "Obesidade grau II = IMC entre 35 e 39,99 kg/m²";
        } else {
            return "Obesidade grau III (obesidade mórbida) = IMC igual ou maior que 40 kg/m²";
        }
    }
}
