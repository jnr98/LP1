package ImagemDoodle;

public class Predio {

    // Atributos (características) da classe
    int classificacao;
    int andares;
    boolean cor;


    public void Descansar() {
        System.out.println("O prédio é um ótimo lugar para descansar.");
    }

    public static void main(String[] args) {

        // Declaração de objeto
        Predio meuPredio;

        // Instanciação do objeto
        meuPredio = new Predio();

        // Declaração e instanciação em uma linha
        Predio predio_residencial = new Predio();

        // chamado o método
        meuPredio.Descansar();
        predio_residencial.Descansar();
    }
}