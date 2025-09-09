package DoodlePreferencia;

public class Cachorro {
    // Atributos
    String nome;
    String raca;
    int idade;

    // Métodos
    public void latir() {
        System.out.println("Au, au!");
    }

    public void comer() {
        System.out.println(this.nome + " está comendo sua ração.");
    }

    public String status() {
        return "Nome: " + this.nome + ", Raça: " + this.raca + ", Idade: " + this.idade;
    }
}