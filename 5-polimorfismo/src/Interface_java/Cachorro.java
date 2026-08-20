package Interface_java;

/*
 * Classe Cachorro:
 * - Também é uma classe concreta que implementa a interface Animal.
 * - Mesmo tendo os mesmos métodos que Gato, a implementação pode ser diferente.
 *
 * Isso mostra o conceito de polimorfismo:
 * - diferentes classes podem ter comportamentos distintos para os mesmos métodos.
 *
 * Exemplo:
 * - Gato: 'Miau!'
 * - Cachorro: 'Uau Uau'
 *
 * O método é a ação; o objeto é o cachorro em si.
 */
public class Cachorro implements Animal{

    @Override
    public void comer() {
        System.out.println("comer: Yamha-Yamha");
        
    }

    @Override
    public void dormir() {
        System.out.println("dormir: Zzzz");
        
    }

    @Override
    public void emitirSom() {
        System.out.println("som: Uau Uau");
        
    }
    
    
}
