package Enum_Numerador;

enum Estacao {
    VERAO,
    OUTONO,
    INVERNO,
    PRIMAVERA
}

public class Roupa {
    String modelo;
    String tamanho;
    Estacao colecao;
   
    public Roupa(String modelo, String tamanho, Estacao colecao) {
        this.modelo = modelo;
        this.tamanho = tamanho;
        this.colecao = colecao;
    }

    public void msg() {
        System.out.println("Modelo: " + modelo + ", Tamanho: " + tamanho + ", Coleção: " + colecao);
        switch (colecao) {
            case VERAO:
                System.out.println("Arrase na praia!");
                break;
        
            case OUTONO:
                System.out.println("Passe o outono com elegância!");
                break;
            case INVERNO:
                System.out.println("Resista ao inverno com conforto!");
                break;
            case PRIMAVERA:
                System.out.println("Desfrute da primavera com frescor!");
                break;
            default:
                System.out.println("Coleção não identificada.");
                break;
        }
    }

    
}
