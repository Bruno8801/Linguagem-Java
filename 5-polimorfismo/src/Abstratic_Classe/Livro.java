package Abstratic_Classe;

// Classe base: representa as caracteristicas comuns de todos os livros.
public abstract class Livro {
    protected Autor autor;
    protected float custoProducao;
    protected float precoVenda;
    protected String titulo;
    protected int paginas;

    // O construtor agora recebe um objeto Autor criado separadamente.
    public Livro(Autor autor, float custoProducao, float precoVenda, String titulo, int paginas) {
        this.autor = autor;
        this.custoProducao = custoProducao;
        this.precoVenda = precoVenda;
        this.titulo = titulo;
        this.paginas = paginas;
    }

    public float lucro() {
        return precoVenda - custoProducao;
    }

    public void imprimirTitulo() {
        System.out.println("Titulo: " + titulo);
    }

    public float imposto() {
        return 0.2f * lucro();
    }

    public float valorRecebido() {
        return lucro() - imposto();
    }

    @Override
    public String toString() {
        String dadosAutor = (autor != null) ? autor.toString() : "Sem autor";

        return String.format(
                "Livro [Autor: %s, Custo de Produção: %.2f, Preço de Venda: %.2f, Título: %s, Páginas: %d, Lucro: %.2f, Imposto: %.2f]",
                dadosAutor,
                custoProducao,
                precoVenda,
                titulo,
                paginas,
                valorRecebido(),
                imposto()
        );
    }

    
}