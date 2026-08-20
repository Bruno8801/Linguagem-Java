package Exercicio_All_temas.Abstratic_venda_comput;

public abstract class Computador {
    protected int GbMemoria;
    protected int NumProcessadores;

    public Computador(int gbMemoria, int numProcessadores) {
        GbMemoria = gbMemoria;
        NumProcessadores = numProcessadores;
    }

    abstract double calculaValor();
    
}

