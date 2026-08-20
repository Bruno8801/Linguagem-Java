package seguranca_de_edicao_de_dados;

public class get_set {
    public static void main(String[] args) {
        Horario aula = new Horario(
            12, 
            48, 
            35
        );
        System.out.printf("Hora: %d%nMinuto: %d%nSegundo: %d", aula.getHora(), aula.getMinuto(), aula.getSegundo());
    }

}
