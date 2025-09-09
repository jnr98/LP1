package DoodlePreferencia;

public class Livro {
    // Atributos
    String titulo;
    String autor;
    int numeroDePaginas;

    // Métodos
    public void abrir() {
        System.out.println("O livro '" + this.titulo + "' foi aberto.");
    }

    public void ler() {
        System.out.println("Você está lendo o livro.");
    }

    public int contarPaginas() {
        return this.numeroDePaginas;
    }
}