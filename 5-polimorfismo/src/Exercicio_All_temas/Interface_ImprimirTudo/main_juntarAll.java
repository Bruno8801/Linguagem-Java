package Exercicio_All_temas.Interface_ImprimirTudo;

import java.util.ArrayList;

public class main_juntarAll {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Maria Antonieta", "123.456.789-10");
        Carro c1 = new Carro("Chevrolet", "Cinza", 250);
        Quadrado cubo = new Quadrado(6);

        Imprimivel i = f1;
        i.imprimir();
        i = c1;
        i.imprimir();
        i = cubo;
        i.imprimir();

        System.out.println("\n=== ABORDAGEM 2: ArrayList ===\n");
        
        ArrayList<Imprimivel> objetosImprimiveis = new ArrayList<>();
        objetosImprimiveis.add(f1);
        objetosImprimiveis.add(c1);
        objetosImprimiveis.add(cubo);

        // Iterando e acionando polimorfismo
        for (Imprimivel obj : objetosImprimiveis) {
            obj.imprimir();
        }
    }
}
