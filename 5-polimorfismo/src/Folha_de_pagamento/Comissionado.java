package Folha_de_pagamento;
public class Comissionado extends Funcionario{
    float vendas;
    float comissao;

    public Comissionado(String nome, int matricula, float vendas, float comissao) {
        super(nome, matricula);
        this.vendas = vendas;
        this.comissao = comissao;
    }

    public float pagamento() {
        return vendas * comissao;
    }
    
}
