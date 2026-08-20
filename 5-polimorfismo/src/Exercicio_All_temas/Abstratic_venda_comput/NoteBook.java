package Exercicio_All_temas.Abstratic_venda_comput;

public class NoteBook extends Computador{
    int polegadasTela;

    public NoteBook(int gbMemoria, int numProcessadores, int polegadasTela) {
        super(gbMemoria, numProcessadores);
        this.polegadasTela = polegadasTela;
    }

    @Override
    double calculaValor() {
        double total = GbMemoria * 250 + NumProcessadores * 500 + polegadasTela * 100;
        return total;
    }
}

