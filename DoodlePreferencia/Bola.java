package DoodlePreferencia;


public class Bola {


    public void lancarBola() {
        System.out.println("A bola está sendo lançada.");
    }


    public static void main(String[] args) {

        Bola bolaDeFutebol = new Bola();
        bolaDeFutebol.lancarBola();

        Jogadores timeA = new Jogadores();
        Torcida torcidaOrganizada = new Torcida();

        // Exemplo de como usar os outros objetos
        timeA.jogadorRecebe();
        torcidaOrganizada.torcidaCanta();
    }
}
