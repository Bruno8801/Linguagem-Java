package Venda_de_Livros;

public class VendaDeLivro {
    public static void main(String[] args) {
        // Exemplo de heranca: criamos primeiro os autores e depois associamos cada livro ao seu autor.
        Autor carla = new Autor("Carla Fonseca", "Brasileira", "carla@email.com");
        Autor tolkien = new Autor("J. R. R. Tolkien", "Britânico", "tolkien@email.com");

        // Exemplo de heranca: um livro fisico e um livro digital compartilham caracteristicas da classe base Livro.
        Livro livroFisico = new Livro(carla, 16.80f, 89.90f, "As Cronicas de Narnia", 320);
        
        LivroDigital_Heranca livroDigital = new LivroDigital_Heranca(tolkien, 12.50f, 49.90f, "O Hobbit", 310,
                "https://exemplo.com/download", 35);

        System.out.println("Livro comprado em loja fisica:");
        System.out.println(livroFisico);

        System.out.println("\nLivro comprado em plataforma digital:");
        System.out.println(livroDigital);
        System.out.println();
    }

    
}
