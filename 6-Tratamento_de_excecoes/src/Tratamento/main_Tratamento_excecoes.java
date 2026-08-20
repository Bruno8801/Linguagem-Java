package Tratamento;
import java.util.Scanner;

public class main_Tratamento_excecoes {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] numeros = {1, 2, 3};
        String[] nomes = {"Ana", null, "Carlos"}; // Índice 1 é nulo!
        boolean entradaValida;

        System.out.println("Iniciando o programa...\n");

        // Teste 1: ArrayIndexOutOfBoundsException
        System.out.println("--- Teste 1: Acesso a Array ---");
        System.out.println("Digite um índice para acessar o array [1, 2, 3]: ");
        do {
            try {
                int indice = teclado.nextInt();
                System.out.println("Acessando índice " + indice + ": " + numeros[indice]);
                System.out.println("[OK] Acesso ao array realizado com sucesso!\n");
                entradaValida = true;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("[ERRO] Índice fora do array: " + e.getMessage() + "\n");
                entradaValida = false;
            } catch (Exception e) {
                System.out.println("[ERRO] Erro geral: " + e.getMessage() + "\n");
                teclado.nextLine(); // Limpar buffer
                entradaValida = false;
            }
        } while (!entradaValida);

        // Teste 2: NumberFormatException
        System.out.println("--- Teste 2: Conversão de Número ---");
        System.out.println("Digite um valor para conversão em número: ");
        do {
            try {
                String valor = teclado.nextLine();
                int numero = Integer.parseInt(valor);
                System.out.println("[OK] Conversão realizada com sucesso! Número: " + numero + "\n");
                entradaValida = true;
            } catch (NumberFormatException e) {
                System.out.println("[ERRO] Formato de número inválido: Não foi possível converter para número\n");
                entradaValida = false;
            } catch (Exception e) {
                System.out.println("[ERRO] Erro geral: " + e.getMessage() + "\n");
                entradaValida = false;
            }
        } while (!entradaValida);

        // Teste 3: NullPointerException
        System.out.println("--- Teste 3: Acesso a String Nula ---");
        System.out.println("Digite um índice para acessar o array de nomes ['Ana', null, 'Carlos']: ");
        System.out.println("Dica: Digite 1 para provocar erro, pois nesse índice há um valor nulo!");
        do {
            try {
                int indiceNome = teclado.nextInt();
                String nome = nomes[indiceNome];
                System.out.println("Primeiro caractere: " + nome.charAt(0)); // Vai dar erro se nome for null
                System.out.println("[OK] Acesso à string realizado com sucesso!\n");
                entradaValida = true;
            } catch (NullPointerException e) {
                System.out.println("[ERRO] Tentativa de acessar objeto nulo: " + e.getMessage() + "\n");
                entradaValida = false;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("[ERRO] Índice fora do array: " + e.getMessage() + "\n");
                entradaValida = false;
            } catch (Exception e) {
                System.out.println("[ERRO] Erro geral: " + e.getMessage() + "\n");
                teclado.nextLine(); // Limpar buffer
                entradaValida = false;
            }
        } while (!entradaValida);

        // Teste 4: ArithmeticException
        System.out.println("--- Teste 4: Divisão ---");
        System.out.println("Digite um número para dividir 10 por ele: ");
        
        do { 
            try {
                int divisor = teclado.nextInt();
                if (divisor <=10 && divisor >0) {
                    int resultado = 10 / divisor;
                    System.out.println("[OK] Divisão realizada com sucesso! Resultado: " + resultado + "\n");
                    entradaValida = true;
                } else {
                    throw new IllegalArgumentException("Você digitou um número fora da divisão por 10, resultando 0, tente novamente!");
                } 
            } catch (ArithmeticException e) {
                System.out.println("[ERRO] Operação aritmética inválida: " + e.getMessage() + "\n");
                teclado.nextLine(); // Limpar buffer
                entradaValida = false;
            } catch (Exception e) {
                System.out.println("[ERRO] Erro geral: " + e.getMessage() + "\n");
                teclado.nextLine(); // Limpar buffer
                entradaValida = false;
            }
        } while (!entradaValida);
        teclado.nextLine(); // Limpar buffer

        System.out.println("Programa finalizado!");
        teclado.close();
    }
}
