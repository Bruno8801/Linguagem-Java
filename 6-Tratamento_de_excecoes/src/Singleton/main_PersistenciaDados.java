package Singleton;

public class main_PersistenciaDados {
    public static void main(String[] args) {
        Singleton inst1 = Singleton.getInstance();
        Singleton inst2 = Singleton.getInstance();

        inst1.numero+=10;
        System.out.println(inst1.numero);
        System.out.println(inst2.numero);
    }
}