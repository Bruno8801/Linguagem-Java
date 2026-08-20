package Folha_de_pagamento;
public class Horista extends Funcionario{
    int horas;
    float valorHora;

    public Horista(String nome, int matricula, int horas, float valorHora) {
        super(nome, matricula);
        this.horas = horas;
        this.valorHora = valorHora;
    }

    public float pagamento() {
        return horas * valorHora;
    }
}
