package Excecoes_em_POO;

import java.util.Scanner;

/**
 * Exemplo didático de criação e uso de exceções personalizadas
 * Demonstra como usar extends para criar exceções customizadas
 */
public class main_Criando_excecoes {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean entradaValida = false;
        
        // Exemplo 1: Validação simples com exceção personalizada
        System.out.println("=== EXEMPLO 1: Validação de Intervalo ===");
        System.out.println("Digite um valor entre 0 e 10: ");
        
        do {
            try {
                int valor = teclado.nextInt();
                validarIntervalo(valor, 0, 10); // Chama método de validação
                System.out.println("[OK] Valor " + valor + " é válido!\n");
                entradaValida = true;
                
            } catch (ValorInvalidoException e) {
                System.out.println("[ERRO] " + e.getMessage());
                System.out.println("Digite novamente: ");
                teclado.nextLine(); // Limpar buffer
                entradaValida = false;
                
            } catch (Exception e) {
                System.out.println("[ERRO] Entrada inválida: " + e.getMessage());
                teclado.nextLine(); // Limpar buffer
                entradaValida = false;
            }
        } while (!entradaValida);
        
        // Exemplo 2: Múltiplas validações
        System.out.println("\n=== EXEMPLO 2: Validação de Idade ===");
        System.out.println("Digite sua idade (18-120): ");
        entradaValida = false;
        
        do {
            try {
                int idade = teclado.nextInt();
                validarIdade(idade); // Validação específica
                System.out.println("[OK] Idade " + idade + " é válida!\n");
                entradaValida = true;
                
            } catch (ValorInvalidoException e) {
                System.out.println("[ERRO] " + e.getMessage());
                System.out.println("Digite novamente: ");
                teclado.nextLine();
                entradaValida = false;
                
            } catch (Exception e) {
                System.out.println("[ERRO] Entrada inválida!");
                teclado.nextLine();
                entradaValida = false;
            }
        } while (!entradaValida);
        
        // Exemplo 3: Nota escolar
        System.out.println("\n=== EXEMPLO 3: Validação de Nota ===");
        System.out.println("Digite uma nota (0-100): ");
        entradaValida = false;
        
        do {
            try {
                int nota = teclado.nextInt();
                validarNota(nota);
                System.out.println("[OK] Nota " + nota + " registrada!\n");
                entradaValida = true;
                
            } catch (ValorInvalidoException e) {
                System.out.println("[ERRO] " + e.getMessage());
                System.out.println("Digite novamente: ");
                teclado.nextLine();
                entradaValida = false;
                
            } catch (Exception e) {
                System.out.println("[ERRO] Entrada inválida!");
                teclado.nextLine();
                entradaValida = false;
            }
        } while (!entradaValida);
        
        System.out.println("Programa finalizado com sucesso!");
        teclado.close();
    }
    
    /**
     * Método que valida se um valor está dentro de um intervalo
     * Lança ValorInvalidoException se estiver fora
     */
    public static void validarIntervalo(int valor, int minimo, int maximo) throws ValorInvalidoException {
        if (valor < minimo || valor > maximo) {
            throw new ValorInvalidoException(
                "Valor " + valor + " está fora do intervalo [" + minimo + "-" + maximo + "]!"
            );
        }
    }
    
    /**
     * Método que valida idade
     * Lança exceção se idade for inválida
     */
    public static void validarIdade(int idade) throws ValorInvalidoException {
        if (idade < 18) {
            throw new ValorInvalidoException(
                "Você tem " + idade + " anos. Deve ter no mínimo 18 anos!"
            );
        }
        if (idade > 120) {
            throw new ValorInvalidoException(
                "Idade " + idade + " é irrealista. Digite uma idade válida!"
            );
        }
    }
    
    /**
     * Método que valida nota escolar
     * Lança exceção se nota for inválida
     */
    public static void validarNota(int nota) throws ValorInvalidoException {
        if (nota < 0 || nota > 100) {
            throw new ValorInvalidoException(
                "Nota " + nota + " é inválida. Use valores de 0 a 100!"
            );
        }
    }
}
