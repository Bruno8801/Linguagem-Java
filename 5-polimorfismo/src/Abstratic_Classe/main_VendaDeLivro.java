package Abstratic_Classe;

public class main_VendaDeLivro {
    public static void main(String[] args) {
        // Criamos primeiro os autores e depois associamos cada livro ao seu autor.
        Autor carla = new Autor("Carla Fonseca", "Brasileira", "carla@email.com");
        Autor tolkien = new Autor("J. R. R. Tolkien", "Britânico", "tolkien@email.com");

        // Exemplo de polimorfismo: ambos os livros são tratados como Livro, mas cada um possui sua própria implementação.
        Livro livro1 = new LivroFisico(carla, 16.80f, 89.90f, "As Crônicas de Nárnia", 320, 850f, true, 8);

        Livro livro2 = new LivroDigital(tolkien, 12.50f, 49.90f, "O Hobbit", 310,
                "https://exemplo.com/download", 35);

        System.out.println("Livro comprado em loja física:");
        System.out.println(livro1);

        System.out.println("\nLivro comprado em plataforma digital:");
        System.out.println(livro2);
        System.out.println();
    }
}
