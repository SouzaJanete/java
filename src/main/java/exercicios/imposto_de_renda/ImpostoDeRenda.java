package exercicios.imposto_de_renda;

public class ImpostoDeRenda {
    private Pessoa pessoa;

    public ImpostoDeRenda(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public double calculaImposto() {
        double salario = pessoa.getSalario();
        double imposto = 0;

        if (salario > 4664.68) {
            imposto += (salario - 4664.68) * 0.275;
            salario -= 4664.68;
        } if (salario > 3751.06) {
            imposto += (salario - 3751.06) * 0.225;
            salario -=3751.06;
        } if (salario > 2826.66) {
            imposto += (salario - 2826.66) * 0.15;
            salario -= 2826.67;
        } if (salario > 2112) {
            imposto += (salario - 2112) * 0.75;
        }
        return imposto;
    }
    public void imprimir() {
        double salario = pessoa.getSalario();
        double imposto = calculaImposto();
        int faixa = FaixaImpostoDeRenda.determinarFaixa(salario);

        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Salario: " + salario);
        System.out.println("Imposto a pagar: R$: " + imposto);
        System.out.println("Faixa do Imposto: " + faixa);
    }
}