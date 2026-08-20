package Folha_de_pagamento;
public class Assalariado extends Funcionario{
    float salario;

    public Assalariado(String nome, int matricula, float salario) {
        super(nome, matricula);
        this.salario = salario;
    }

    public float pagamento() {
        return salario;
    }
}
