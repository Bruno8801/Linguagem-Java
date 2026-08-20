package seguranca_de_edicao_de_dados;

import java.util.ArrayList;
import java.util.Collections;

public class collections {
    public static void main(String[] args) {
        ArrayList<String> pessoas = new ArrayList<>();
        pessoas.add("Mariano");
        pessoas.add("Bruna");
        pessoas.add("Rafael");
        pessoas.add("Luciano");

        System.out.println(pessoas);
        System.out.println("Imprimindo um dado específico: " + pessoas.get(1));
        
        pessoas.remove(2); // posição do dado contanto de 0 em diante
        System.out.println("Remoção de dados: " + pessoas);

        pessoas.add("Luigi");
        System.out.println("Adicionando dados: " + pessoas);
        
        System.out.println("Orden original: " + pessoas);
        
        Collections.sort(pessoas);
        System.out.println("Ordem alfabética: " + pessoas);
        
        Collections.shuffle(pessoas);
        System.out.println("Ordem aleatória: " + pessoas);
        
        Collections.reverse(pessoas);
        System.out.println("Ordem reversa: " + pessoas);

        System.out.println("Elemento Máximo: " + Collections.max(pessoas));
        System.out.println("Elemento mínimo: " + Collections.min(pessoas));
    }
}
