package DoodlePreferencia;

public class Main {
    public static void main(String[] args) {

        // Criando e usando um objeto da classe Carro
        System.out.println("--- Testando a classe Carro ---");
        Carro meuCarro = new Carro();
        meuCarro.marca = "Toyota";
        meuCarro.modelo = "Corolla";
        meuCarro.ano = 2024;

        meuCarro.ligarMotor();
        meuCarro.acelerar();
        System.out.println(meuCarro.pegarInformacoes());

        System.out.println(); // Pula uma linha para separar a saída

        // Criando e usando um objeto da classe Cachorro
        System.out.println("--- Testando a classe Cachorro ---");
        Cachorro meuCachorro = new Cachorro();
        meuCachorro.nome = "Max";
        meuCachorro.raca = "Exotic Bully";
        meuCachorro.idade = 2;

        meuCachorro.latir();
        meuCachorro.comer();
        System.out.println(meuCachorro.status());

        System.out.println(); // Pula uma linha

        // Criando e usando um objeto da classe Livro
        System.out.println("--- Testando a classe Livro ---");
        Livro meuLivro = new Livro();
        meuLivro.titulo = "Extraordinário";
        meuLivro.autor = "Raquel Jaramillo";
        meuLivro.numeroDePaginas = 320;

        meuLivro.abrir();
        meuLivro.ler();
        System.out.println("O livro tem " + meuLivro.contarPaginas() + " páginas.");
    }
}