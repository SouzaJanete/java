package exercicios.veiculo;

public class Heranca {
    public static void main(String[] args) {
        Carro c = new Carro();
        c.modelo = "Gol";
        c.cor = "vermelho";
        c.fabricante = "vw";
        c.setNumeroRodas(4);
        c.tipoPropulsao = "Elétrica";
        System.out.println(c.getClass().getName() + "  : Modelo " + c.modelo + "Fabricante:" + c.fabricante + "N. Rodas:" + c.getNumeroRodas() + " Tipo propulsão :" + c.tipoPropulsao);

        Bicicleta b = new Bicicleta();
        b.marca = "Shimano";
        b.aro = 29;
        System.out.println(b.marca + " " + b.aro + " ");


    }
}