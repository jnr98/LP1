
public class Main {
    public static void main(String[] args) {
        Deus deus = new Deus();
        Anjo anjo = new Anjo();
        Dinossauro dino = new Dinossauro("Dinossauros");

        deus.darOrdem(anjo, dino);
    }
}