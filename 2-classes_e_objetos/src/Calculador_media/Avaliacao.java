package Calculador_media;

public class Avaliacao {
    private String nome;
    private float nota1;
    private float nota2;
    private float nota3;

    // Construtor que inicializa o nome e as notas do aluno
    public Avaliacao(String nome, float nota1, float nota2, float nota3) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    // Retorna o nome do aluno
    public String getNome() {
        return nome;
    }

    // Calcula a média aritmética simples de três notas
    public float calcularMediaAritmetica() {
        return (nota1 + nota2 + nota3) / 3f;
    }

    // Calcula a média ponderada usando os pesos informados
    // A divisão é feita pela soma dos pesos (peso1 + peso2 + peso3)
    public float calcularMediaPonderada(int peso1, int peso2, int peso3) {
        float somaPesos = peso1 + peso2 + peso3; // soma dos pesos
        return (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / somaPesos;
    }

    // Retorna uma String com as informações do aluno e suas médias
    @Override
    public String toString() {
        int peso1 = 2; // peso fixo da nota1
        int peso2 = 3; // peso fixo da nota2
        int peso3 = 4; // peso fixo da nota3
        return "Média do Aluno {" +
                " Nome= " + nome +
                ", notas= " + nota1 + ", " + nota2 + ", " + nota3 +
                ", Média Aritmética= " + calcularMediaAritmetica() +
                ", Média Ponderada= " + calcularMediaPonderada(peso1, peso2, peso3) +
                " }";
    }
}
