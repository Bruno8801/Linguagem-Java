package Ingressos;

public class Ingresso {
    String nomeEvento;
    double valor;
    
    public Ingresso(String nomeEvento, double valor) {
        this.nomeEvento = nomeEvento;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Ingresso [Evento = " + nomeEvento + ", valor = " + valor + "]";
    }
 
}
