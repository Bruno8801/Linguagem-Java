package Exercicio_All_temas.Interface_ImprimirTudo;

public class Funcionario implements Imprimivel{
    String nome;
    String cpf;

    public Funcionario(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    @Override
    public void imprimir() {
        System.out.println("Funcionário");
        System.out.println("Nome: " + nome);
        System.out.println("cpf: " + cpf);
        System.out.println("-----------------");
    }

}
