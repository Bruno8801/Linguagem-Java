package Exercicio_All_temas.Interface_ImprimirTudo;

public class Carro implements Imprimivel {
    String marca;
    String cor;
    double velocidadeMax;
    
    public Carro(String marca, String cor, double velocidadeMax) {
        this.marca = marca;
        this.cor = cor;
        this.velocidadeMax = velocidadeMax;
    }

    @Override
    public void imprimir() {
        System.out.println("Veículo");
        System.out.println("Marca: " + marca);
        System.out.println("Cor: " + cor);
        System.out.println("Velocidade Máxima: " + velocidadeMax);
        System.out.println("-----------------");
    }
    
    
}
