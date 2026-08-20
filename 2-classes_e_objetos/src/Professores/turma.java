package estudantes;

public class turma {
    public static void main(String[] args) {
        Professor professor1 = new Professor(
            "Fabiano Fonseca", 
            "Engenharia da Computação"
        );
    
        Professor professor2 = new Professor(
            "Priscilla Alcantara", 
            "Musica"
        );
    
        Professor professor3 = new Professor(
            "Rihanna Matura", 
            "Medicina"
        );

        System.out.println(professor1);
        System.out.println(professor2);
        System.out.println(professor3);
    }

}
