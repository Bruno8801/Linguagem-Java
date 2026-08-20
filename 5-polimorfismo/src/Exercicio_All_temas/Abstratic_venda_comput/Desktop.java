package Exercicio_All_temas.Abstratic_venda_comput;

public class Desktop extends Computador{
    double acessorios;

    public Desktop(int gbMemoria, int numProcessadores, double acessorios) {
        super(gbMemoria, numProcessadores);
        this.acessorios = acessorios;
    }

    @Override
    double calculaValor() {
        double total = GbMemoria * 200 + NumProcessadores * 400 + acessorios;
        return total;
    }
}
