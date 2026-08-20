package Exercicio_All_temas.Interface_ImprimirTudo;

public class Quadrado implements Imprimivel{
    int lados;
    
    public Quadrado(int lados) {
        this.lados = lados;
    }

    @Override
    public void imprimir() {
        System.out.println("Geometria");
        System.out.println("Medida dos lados: " + lados);
        System.out.println("Área: " + (4 * lados));
        System.out.println("-----------------");
    }
}
