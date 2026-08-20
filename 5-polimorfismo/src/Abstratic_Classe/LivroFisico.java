package Abstratic_Classe;

// Herança: esta classe herda de Livro e acrescenta atributos específicos de um livro físico.
public class LivroFisico extends Livro {
    public float pesoGramas;
    public boolean capaDura;
    public int quantidadeCopias;

    // Construtor principal com valor padrão de uma cópia.
    public LivroFisico(Autor autor, float custoProducao, float precoVenda, String titulo, int paginas,
                       float pesoGramas, boolean capaDura) {
        this(autor, custoProducao, precoVenda, titulo, paginas, pesoGramas, capaDura, 1);
    }

    // Construtor com quantidade de cópias.
    public LivroFisico(Autor autor, float custoProducao, float precoVenda, String titulo, int paginas,
                       float pesoGramas, boolean capaDura, int quantidadeCopias) {
        super(autor, custoProducao, precoVenda, titulo, paginas);
        this.pesoGramas = pesoGramas;
        this.capaDura = capaDura;
        this.quantidadeCopias = quantidadeCopias;
    }

    public float imposto() {
        return 0.2f * lucro() + 3;
    }

    public float custoEnvio() {
        return pesoGramas / 1000f * 5f;
    }

    public float valorUnitario() {
        return precoVenda;
    }

    public float valorTotal() {
        return precoVenda * quantidadeCopias;
    }

    @Override
    public String toString() {
        String dadosAutor = (autor != null) ? autor.toString() : "Sem autor";

        return String.format(
                "Livro Físico [Autor: %s, Custo de Produção: %.2f, Preço de Venda Unitário: %.2f, Quantidade de Cópias: %d, Valor Total: %.2f, Título: %s, Páginas: %d, Peso: %.2f g, Capa Dura: %s, Lucro: %.2f, Imposto: %.2f, Custo de Envio: %.2f]",
                dadosAutor,
                custoProducao,
                valorUnitario(),
                quantidadeCopias,
                valorTotal(),
                titulo,
                paginas,
                pesoGramas,
                capaDura ? "Sim" : "Não",
                valorRecebido(),
                imposto(),
                custoEnvio()
        );
    }
}
