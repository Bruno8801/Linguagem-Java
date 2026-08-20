package conteudo_Pratico_excecoes.simuladorBanco_exceptions;

import java.util.HashMap;
import java.util.Map;

public class Banco {
    private static Banco instancia;
    private final Map<String, Conta> contas;

    private Banco() {
        contas = new HashMap<>();
    }

    public static Banco getInstancia() {
        if (instancia == null) {
            instancia = new Banco();
        }
        return instancia;
    }

    public void cadastrarConta(Conta conta) {
        if (conta == null) {
            throw new IllegalArgumentException("Conta inválida");
        }
        if (contas.containsKey(conta.conta)) {
            throw new IllegalArgumentException("Conta já cadastrada");
        }
        contas.put(conta.conta, conta);
    }

    public Conta buscarConta(String identificador) {
        Conta conta = contas.get(identificador);
        if (conta == null) {
            throw new IllegalArgumentException("Conta não encontrada");
        }
        return conta;
    }

    public void transferir(String origem, String destino, double valor) {
        Conta contaOrigem = buscarConta(origem);
        Conta contaDestino = buscarConta(destino);
        contaOrigem.transferir(valor, contaDestino);
    }
}
