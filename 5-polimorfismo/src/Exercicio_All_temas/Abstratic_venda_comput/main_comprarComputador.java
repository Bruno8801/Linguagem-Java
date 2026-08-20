package Exercicio_All_temas.Abstratic_venda_comput;

import java.util.ArrayList;

public class main_comprarComputador {
    public static void main(String[] args) {
        Desktop lenovo = new Desktop(16, 8, 4);

        NoteBook apple = new NoteBook(48, 20, 16);

        ArrayList<Computador> listaComputadores = new ArrayList<>();
        listaComputadores.add(lenovo);
        listaComputadores.add(apple);

        double total = 0;
        for (Computador c : listaComputadores) {
            total += c.calculaValor();
        }

        System.out.println("Valor do " + lenovo.getClass().getSimpleName() + ": " + lenovo.calculaValor()+ " R$");

        System.out.println("\nValor do " + apple.getClass().getSimpleName() + ": " + apple.calculaValor()+ " R$\n");

        System.out.println("Total da compra: " + total + "\n");
    }
}
