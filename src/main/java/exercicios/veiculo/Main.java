package exercicios.veiculo;

public class Main {
    public static void main(String[] args) {
        Carro c = new Carro();
        c.modelo = "Ka";
        c.fabricante = "Ford";
        c.cor = "Prata";
        c.setNumeroRodas (4);
        System.out.println("\n" + c.getClass().getName() + " Modelo: "+ c.modelo + " Fabricante: " + c.fabricante +
                " Cor " + c.cor + " Numerorodas: " + c.getNumeroRodas());

    }
        }

