package Folha_de_pagamento;
public class pagamento {
    public static void main(String[] args) {
        /* Inserindo dados em um array para a criação de uma planilha de dados, utilizando o polimorfismo, que oferece importantes vantagens na linguagem Java. */
        Funcionario[] meusFuncionarios = {
            new Assalariado("Akalih", 10025, 2800),
            new Horista("Yone", 10029, 36, 98),
            new Comissionado("Jhin", 10042, 180, 35)
        };

        Funcionario f;
        float total = 0;

        // Imprime o cabeçalho da tabela com larguras fixas
        System.out.printf("%-15s | %-12s | %-12s%n", "Funcionário", "Matrícula", "Pagamento");
        System.out.println("-----------------------------------------------------");

        for (int i = 0; i < meusFuncionarios.length; i++) {
            f = meusFuncionarios[i];
            float pagamento = f.pagamento();

            // Imprime os dados alinhados nas mesmas larguras do cabeçalho
            System.out.printf("%-15s | %-12s | R$ %-9.2f%n", f.nome, f.matricula, pagamento);

            total += pagamento;
        }

        System.out.println("-----------------------------------------------------");
        System.out.printf("Total pago: R$ %.2f%n", total);
    }
}
