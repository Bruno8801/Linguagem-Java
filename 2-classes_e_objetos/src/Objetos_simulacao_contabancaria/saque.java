package Objetos_simulacao_contabancaria;

public class saque {
    public static void main(String[] args) {
        Conta c1 = new Conta(111, "João Pedro", 2000, 500);

        c1.info();

        if (!c1.sacar(0)) {
            System.out.println("Problema ao sacar!"); // outra forma de usar uma negação de uma ação é usando o ! no inicio da condição
        }
        if (!c1.depositar(-85)) {
            System.out.println("Problema ao depositar!");
        }
        System.out.println();
        c1.info();
    }
}
