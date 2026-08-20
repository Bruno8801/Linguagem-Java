import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class arrays_reverso {
    public static void main(String[] args) {
        int qtd;
        Scanner teclado = new Scanner(System.in);
        teclado.useLocale(Locale.US);

        System.out.println("Digite a quantidade de nomes: ");
        qtd = teclado.nextInt();
        teclado.nextLine();

        String [] listaNomes = new String[qtd];
        for (int i = 0; i < qtd; i++) {
            System.out.print("Digite o nome " + (i+1) + ": ");
            listaNomes[i] = teclado.nextLine();
        }
        System.out.println("\nNome em ordem reversa:");
        for (int i = qtd -1; i >= 0; i--) {
            System.out.println(listaNomes[i]);
        }

        // usando o atalho de array em coleção reversa
        List<String> listaReversa = Arrays.asList(listaNomes); // converter arrays em list
        Collections.reverse(listaReversa);
        
        System.out.println("\nNome em ordem reversa usando Collections.reverse");
        System.out.println(listaReversa + "\n");
        
        teclado.close();
    }
}
