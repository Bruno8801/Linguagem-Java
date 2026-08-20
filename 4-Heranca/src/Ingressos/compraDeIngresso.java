package Ingressos;

public class compraDeIngresso {
    public static void main(String[] args) {
        Ingresso padrao = new Ingresso("Equilibium Anitta", 80.90);

        IngressoVip vip = new IngressoVip("Equilibrium Anitta Vip", 80.90, 120);

        System.out.println("Dados do Ingresso Padrão:\n");
        System.out.println(padrao);

        System.out.println("\nDados do Ingresso VIP:\n");
        System.out.println(vip);
    }
    
}
