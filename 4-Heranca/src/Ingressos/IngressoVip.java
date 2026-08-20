package Ingressos;

public class IngressoVip extends Ingresso {
    double adicional;

    public IngressoVip(String nomeEvento, double valor, double adicional) {
        super(nomeEvento, valor);
        this.adicional = adicional;
    }

    public double valorAdicional() {
        return valor + adicional;
    }

    @Override
    public String toString() {
        return "Ingresso Vip [Evento = " + nomeEvento + ", valor = " + valorAdicional()+"]";
    }
 
}
