package ImagemDoodle;

public class Barco {

    // Atributos (características) do Barco
    double tamanho;
    String estilo;
    String tipo;

    // Métodos (ações) da classe
    public void navegar(int distancia) {
        System.out.println("O barco navegou " + distancia + "Km.");
    }

    public String ancorar(double pesoAncora) {
        System.out.println("O peso da âncora é " + pesoAncora + " kg.");
        return "Ancorado com sucesso.";
    }

    // Método principal para testar a classe
    public static void main(String[] args) {

        // Declaração e instanciação de objetos
        Barco meuBarco; // Declaração
        meuBarco = new Barco(); // Instanciação

        Barco iate_luxo = new Barco();

        // Chamado os métodos
        System.out.println(meuBarco.ancorar(250.5));
        iate_luxo.navegar(100);
    }
}
