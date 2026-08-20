package Folha_de_pagamento;
public class Funcionario {
    String nome;
    int matricula;

    public Funcionario(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public float pagamento() {
        System.out.println("Processando pagamento");
        return 0.0f;
    }
}

