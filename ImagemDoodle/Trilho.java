package ImagemDoodle;

public class Trilho {

    // Atributos (características) da classe
    int extensao;
    String material;
    boolean tipo;


    public void locomover() {
        System.out.println("O trilho permite a locomoção de um trem.");
    }


    public static void main(String[] args) {

        // Declaração de objeto
        Trilho meuTrilho;

        // Instanciação do objeto
        meuTrilho = new Trilho();

        // Declaração e instanciação em uma linha
        Trilho trilho_ferroviario = new Trilho();


        meuTrilho.locomover();
        trilho_ferroviario.locomover();
    }
}