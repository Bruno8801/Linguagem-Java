package Calculador_media;

import java.util.Locale;
import java.util.Scanner;


public class calc_media {
    public static void main(String[] args) {
        // Cria um Scanner para ler dados do teclado
        Scanner teclado = new Scanner(System.in);
        teclado.useLocale(Locale.US); // usa ponto como separador decimal

        // Pede ao usuário o nome do aluno
        System.out.print("Digite o nome do aluno: ");
        String nome = teclado.nextLine();

        // Pede as três notas do aluno
        System.out.print("Digite a nota da avaliação 1: ");
        float nota1 = teclado.nextFloat();

        System.out.print("Digite a nota da avaliação 2: ");
        float nota2 = teclado.nextFloat();

        System.out.print("Digite a nota da avaliação 3: ");
        float nota3 = teclado.nextFloat();

        // Cria o objeto Avaliacao com as notas informadas
        Avaliacao semestre = new Avaliacao(nome, nota1, nota2, nota3);

        // Define os pesos fixos das notas
        int peso1 = 2;
        int peso2 = 3;
        int peso3 = 4;

        System.out.println("\nCálculo das médias:");
        System.out.println("Aluno: " + semestre.getNome());
        System.out.printf("Notas: %.2f, %.2f, %.2f%n", nota1, nota2, nota3);
        System.out.printf("Média aritmética: %.2f%n", semestre.calcularMediaAritmetica());
        System.out.printf("Média ponderada (%d-%d-%d): %.2f%n", peso1, peso2, peso3, semestre.calcularMediaPonderada(peso1, peso2, peso3));

        System.out.println(" ");
        System.out.println(semestre); // print usando o @toString da classe Avaliacao

        // Fecha o scanner para liberar recursos
        teclado.close();
    }
}
