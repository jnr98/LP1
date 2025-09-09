package Musica;

public class Main {
    public static void main(String[] args) {
        Paz paz = new Paz("Filho", "Rebelde", "Choro");
        paz.repouseSuaCabecaCansada();

        Sorte sorte = new Sorte("Mar", "Emoções", "Navio");
        sorte.seguirEmFrenteEncontrarPaz();

        SeguirEmFrente seguir = new SeguirEmFrente("Paraíso", "Lembranças", "Paz");
        seguir.oParaisoOAguarda();
    }
}