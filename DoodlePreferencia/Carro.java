package DoodlePreferencia;

public class Carro {
    // Atributos
    String marca;
    String modelo;
    int ano;

    // Métodos
    public void ligarMotor() {
        System.out.println("O motor do carro está ligado.");
    }

    public void acelerar() {
        System.out.println("O carro está acelerando.");
    }

    public String pegarInformacoes() {
        return "Marca: " + this.marca + ", Modelo: " + this.modelo + ", Ano: " + this.ano;
    }
}