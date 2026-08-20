package Igualdade_de_Objetos;

public class main_comparador_de_objetos {
    public static void main(String[] args) {
        // Exemplo 1 -- comparando objetos em memória
        String s1 = new String("Olá Bom dia");
        String s2 = new String("Olá Boa noite");
        String s3 = s1;

        System.out.println("Comparando endereço de memória:\n");
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);

        System.out.println("\nComparando valor em memória:\n");
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));

        // Exemplo 2 -- comparando class (Usuario.java)
        System.out.println("\nComparando em class:\n");
        Usuario user1 = new Usuario(25001, "Maria Antonieta", "123.456.789-12");
        Usuario user2 = new Usuario(25001, "Maria Antonieta", "123.456.789-12");
        Usuario user3 = user1;

        System.out.println("Comparando endereço de memória:\n");
        System.out.println(user1 == user2);
        System.out.println(user1 == user3);

        System.out.println("\nComparando valor em memória:\n");
        System.out.println(user1.equals(user2));
        System.out.println(user1.equals(user3));

    }
}
