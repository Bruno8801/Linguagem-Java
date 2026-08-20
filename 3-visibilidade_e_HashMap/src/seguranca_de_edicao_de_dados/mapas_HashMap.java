package seguranca_de_edicao_de_dados;

import java.util.HashMap;

public class mapas_HashMap {
    public static void main(String[] args) {
        HashMap<String,String> capitais = new HashMap<>();
        capitais.put("Brasil", "Brasília");
        capitais.put("Argentina", "Buenos Aires");
        capitais.put("Uruguai", "Montevidéu");
        capitais.put("Paraguai", "Assunção");

        System.out.println(capitais);
        System.out.println(capitais.get("Uruguai"));
    }
}
