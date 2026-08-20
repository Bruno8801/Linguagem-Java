package conteudo_Pratico_excecoes.simuladorBanco_exceptions;

public class Conta {
    String nome;
    String conta;
    final double saldoInicial;
    double saldo;
    double valorDepositado;
    double valorSacado;
    double valorTransferido;
    double valorRecebido;
    
    public Conta(String nome, String conta, double saldo) {
        this.nome = nome;
        this.conta = conta;
        this.saldoInicial = saldo;
        this.saldo = saldo;
    }

    void depositar(double valor) throws IllegalArgumentException {
        if (valor < 0) {
            throw new IllegalArgumentException("Valor inválido");
        }
        valorDepositado = valor;
        saldo += valor;
    }

    void sacar(double valor) throws IllegalArgumentException {
        if (valor > saldo) {
            throw new IllegalArgumentException("Saldo insuficiente");
        }
        if (valor < 0) {
            throw new IllegalArgumentException("Valor inválido");
        }
        valorSacado = valor;
        saldo -= valor;
    }

    void transferir (double valor, Conta destino) throws IllegalArgumentException {
        if (valor < 0) {
            throw new IllegalArgumentException("Valor inválido");
        }
        if (valor > saldo) {
            throw new IllegalArgumentException("Saldo insuficiente");
        }
        valorTransferido = valor;
        saldo -= valor;
        destino.recebido(valor);
    }

    void recebido (double valor) throws IllegalArgumentException {
        if (valor < 0) {
            throw new IllegalArgumentException("Valor inválido");
        }
        valorRecebido = valor;
        saldo += valor;
    }

    @Override
    public String toString() {
        return "---- Dados da Conta ----\n" 
                + "nome: " + nome + "\n"
                + "conta: " + conta + "\n"
                + "saldo: " + saldoInicial + "\n"
                + "valor depositado: " + valorDepositado + "\n"
                + "valor do saque: " + valorSacado + "\n"
                + "valor transferido: " + valorTransferido + "\n"
                + "valor recebido: " + valorRecebido + "\n"
                + "saldo disponível: " + saldo + "\n";
    }

    
    
}
