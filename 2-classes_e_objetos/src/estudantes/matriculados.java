package estudantes;

public class matriculados {
    public static void main(String[] args) {
        Alunos aluno1 = new Alunos(
                "Maria Antonieta",
                "09857422553",
                "05/03/2008"
        );

        Alunos aluno2 = new Alunos(
                "João Silva",
                "12345678900",
                "10/07/2005"
        );

        Alunos aluno3 = new Alunos (
            "Bruno Silva",
            "09502144553",
            "29/05/2009"
        );

        System.out.println(aluno1);
        System.out.println(aluno2);
        System.out.println(aluno3);
    }
}
