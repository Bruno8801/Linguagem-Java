package Professores;

public class Professor {
    private static int contCadastro = 1000;
    private String nome;
    private String formacao;
    private int cadastro;

    public Professor(String nome, String formacao) {
        this.nome = nome;
        this.formacao = formacao;
        this.cadastro = contCadastro; contCadastro++;
    }

    @Override
    public String toString() {
        return "Professor {" +
                " nome= " + nome +
                ", formacao= " + formacao +
                ", cadastro= " + cadastro +
                " }";
    }
}