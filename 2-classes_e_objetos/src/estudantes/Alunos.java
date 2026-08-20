package estudantes;

public class Alunos {
    private static int contMatri = 1000;
    private final int matricula;
    private String nome;
    private String cpf;
    private String nascimento;

    public Alunos(String nome, String cpf, String nascimento) {
        this.matricula = contMatri; contMatri++;
        this.nome = nome;
        this.cpf = cpf;
        this.nascimento = nascimento;
    }

    @Override
    public String toString() {
        return "Aluno {" +
                " matricula= " + matricula +
                ", nome= " + nome +
                ", cpf= " + cpf +
                ", nascimento= " + nascimento +
                " }";
    }
}
