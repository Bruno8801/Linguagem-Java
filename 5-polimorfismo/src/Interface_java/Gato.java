package Interface_java;

/*
 * Classe Gato:
 * - É uma classe concreta, ou seja, ela pode ser instanciada.
 * - 'implements Animal' significa que Gato deve seguir o contrato da interface.
 * - Então ela precisa implementar todos os métodos da interface: comer(), dormir() e emitirSom().
 *
 * @Override:
 * - Indica que o método está sobrescrevendo a implementação da interface.
 * - Isso é importante para garantir que o comportamento do gato esteja correto.
 *
 * Método:
 * - É uma ação da classe. Exemplo: emitirSom(), comer(), dormir().
 */
public class Gato implements Animal {

    @Override
    public void comer() {
        System.out.println("comer: Yamh");
        
    }

    @Override
    public void dormir() {
       System.out.println("dormir: Zzz");
        
    }

    @Override
    public void emitirSom() {
        System.out.println("som: Miau!");
        
    }
    
}
