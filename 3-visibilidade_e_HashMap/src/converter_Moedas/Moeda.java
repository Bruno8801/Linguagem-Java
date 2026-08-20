package converter_Moedas;

public class Moeda {
    private String moeda;
    private double valor;
    
    public Moeda(String moeda, double valor) {
        this.moeda = moeda;
        this.valor = valor;
    }

    public String getMoeda() {
        return moeda;
    }

    public void setMoeda(String moeda) {
        this.moeda = moeda;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    

    
}
