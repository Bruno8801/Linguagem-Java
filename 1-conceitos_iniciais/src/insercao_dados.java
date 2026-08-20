import java.util.Locale;
import java.util.Scanner;

public class insercao_dados {
    public static void main(String[] args) {
        String nome;
        int idade;
        double peso;

        Scanner teclado = new Scanner(System.in);
        teclado.useLocale(Locale.US);

        System.out.print("Digite seu nome: ");
        nome = teclado.nextLine();

        System.out.print("Digite sua idade: ");
        idade = teclado.nextInt();
        if (idade < 18) {
            System.out.printf("Olá %s Você não pode acessar essa página, ela é destinada a maiores de 18 anos.\n", nome);
            teclado.close();
            return;
        }

        System.out.print("Digite seu peso: ");
        peso = teclado.nextDouble();

        System.out.println();
        System.out.println("Os Dados digitados foram");
        System.out.println("Nome: " + nome);
        System.out.printf("Idade: %d anos\n", idade);
        System.out.printf(Locale.US, "Peso: %.2f Kg", peso);

        teclado.close();
    }
}

