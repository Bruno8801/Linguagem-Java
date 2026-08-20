package Interface_java;

/*
 * Interface Animal:
 * - É um contrato que define o que qualquer animal deve fazer.
 * - Em Java, uma interface não implementa o comportamento completo;
 *   ela apenas declara métodos que as classes que a implementam devem criar.
 * - Quando uma classe faz 'implements Animal', ela promete implementar
 *   todos os métodos dessa interface.
 *
 * Métodos declarados:
 * - emitirSom(): faz o animal produzir um som.
 * - comer(): define a ação de se alimentar.
 * - dormir(): define a ação de dormir.
 *
 * Importante:
 * - Métodos em interface são públicos e abstratos por padrão.
 * - Isso ajuda a padronizar comportamento entre diferentes classes.
 */
public interface Animal {
    public void emitirSom();
    public void comer();
    public void dormir();
    
}
