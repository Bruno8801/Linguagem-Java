package Abstratic_Classe;

// Heranca: esta classe herda de Livro e acrescenta atributos especficos de um ebook.
public class LivroDigital extends Livro {
    public String linkDownload;
    public int tamanhoMB;

    // O construtor tambem precisa receber o objeto Autor criado separadamente.
    public LivroDigital(Autor autor, float custoProducao, float precoVenda, String titulo, int paginas, String linkDownload, int tamanhoMB) {
        super(autor, custoProducao, precoVenda, titulo, paginas);
        this.linkDownload = linkDownload;
        this.tamanhoMB = tamanhoMB;
    }

    public float imposto() {
        return 0.2f * lucro() + 2;
    }

    public float tamanhoPorPagina() {
        return tamanhoMB/(float)paginas;
    }

    @Override
    public String toString() {
        String dadosAutor = (autor != null) ? autor.toString() : "Sem autor";

        return String.format(
                "Livro Digital [Autor: %s, Custo de Produção: %.2f, Link de Download: %s, Preço de Venda: %.2f, Tamanho em MB: %d, Título: %s, Páginas: %d, Tamanho por Página: %.2f, Lucro: %.2f, Imposto: %.2f]",
                dadosAutor,
                custoProducao,
                linkDownload,
                precoVenda,
                tamanhoMB,
                titulo,
                paginas,
                tamanhoPorPagina(),
                valorRecebido(),
                imposto()
          
        );
    }

    
}
