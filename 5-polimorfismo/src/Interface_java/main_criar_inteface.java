package Interface_java;

/*
 * Classe principal: criar_inteface
 * - Esta classe contém o método 'main', que é o ponto de entrada da aplicação Java.
 * - Quando você executa o programa, o Java procura por 'public static void main(String[] args)'.
 *
 * Objetos:
 * - 'Gato g1 = new Gato();'
 *   - 'g1' é uma variável de referência que aponta para um objeto da classe Gato.
 *   - 'new Gato()' cria um novo objeto na memória.
 *   - 'Gato' é o tipo da variável.
 *
 * Construtor:
 * - No exemplo, não foi criado um construtor explícito.
 * - Quando não escrevemos nenhum construtor, o Java cria automaticamente um construtor padrão.
 * - O construtor é usado para criar o objeto.
 *
 * Métodos de instância:
 * - Depois que o objeto é criado, você pode chamar os métodos dele:
 *   g1.emitirSom();
 *   g1.comer();
 *   g1.dormir();
 *
 * getClass().getSimpleName():
 * - Retorna o nome simples da classe do objeto em tempo de execução.
 * - Exemplo: 'Gato' ou 'Cachorro'.
 *
 * printf:
 * - É usado para formatar a saída na tela.
 * - '%s' serve para inserir uma string.
 */
public class main_criar_inteface {
    public static void main(String[] args) {
        // Cria um objeto da classe Gato
        Gato g1 = new Gato();
        // Cria um objeto da classe Cachorro
        Cachorro c1 = new Cachorro();

        System.out.println("Primeiro animal: " + g1.getClass().getSimpleName());

        // Chamada dos métodos do objeto g1
        g1.emitirSom();
        g1.comer();
        g1.dormir();

        System.out.println("\nOutro animal: " + c1.getClass().getSimpleName());

        // Chamada dos métodos do objeto c1
        c1.comer();
        c1.dormir();
        c1.emitirSom();

        Gato g3 = new Gato();
        System.out.printf("\nPegando o nome do Objeto do gato usando printf: %s ", g3.getClass().getSimpleName());


    }
}
