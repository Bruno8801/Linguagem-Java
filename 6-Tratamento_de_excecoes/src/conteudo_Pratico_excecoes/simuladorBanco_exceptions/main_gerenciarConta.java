package conteudo_Pratico_excecoes.simuladorBanco_exceptions;

import java.util.Scanner;
import java.util.InputMismatchException;

public class main_gerenciarConta {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            boolean transferirDinheiro = false;
            Banco banco = Banco.getInstancia();

            banco.cadastrarConta(new Conta("Bruno Rodrigues", "Nubank",82958));
            banco.cadastrarConta(new Conta("Veronica Silva", "Banco do Brasil",36820));

            Conta nub = banco.buscarConta("Nubank");
            Conta bra = banco.buscarConta("Banco do Brasil");

            nub.depositar(42);
            bra.sacar(610);

            do {
                try {
                    System.out.println("Digite um valor para transferir: ");
                    double valorTransferencia = teclado.nextDouble();
                    banco.transferir("Nubank", "Banco do Brasil", valorTransferencia);
                    System.out.println(nub);
                    System.out.println(bra);
                    System.out.println("Operação realizada com sucesso!");
                    transferirDinheiro = true;
                } catch (InputMismatchException e) {
                    System.err.println("Erro: digite um valor numérico.");
                    teclado.nextLine();
                } catch (IllegalArgumentException e) {
                    System.err.println("Erro: " + e.getMessage());
                    teclado.nextLine();
                }
            } while (!transferirDinheiro);
        }
    }
}
