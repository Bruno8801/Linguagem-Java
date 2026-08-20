package converter_Moedas;

public class conversor {
    public static void main(String[] args) {
        Poupanca banco_brasil = new Poupanca ();
            banco_brasil.add (new Moeda ("euro",5.83));
            banco_brasil.add (new Moeda ("dollar",5.10));

            System.out.printf("O total da poupança é: %.3f R$ \n", banco_brasil.calcularTotal());
    }
}
