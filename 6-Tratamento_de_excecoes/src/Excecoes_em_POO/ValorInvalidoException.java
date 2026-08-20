package Excecoes_em_POO;

/**
 * Exceção personalizada que herda de Exception
 * Usada para validar valores fora do intervalo permitido
 */
public class ValorInvalidoException extends Exception {
    
    // Construtor padrão sem mensagem
    public ValorInvalidoException() {
        super("Valor inválido!");
    }
    
    // Construtor com mensagem personalizada
    public ValorInvalidoException(String mensagem) {
        super(mensagem);
    }
    
    // Construtor com mensagem e causa da exceção
    public ValorInvalidoException(String mensagem, Throwable causa) {
        super(mensagem, causa);
    }
}
