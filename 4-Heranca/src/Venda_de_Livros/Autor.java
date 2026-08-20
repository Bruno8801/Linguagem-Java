package Venda_de_Livros;

public class Autor {
    private String nome;
    private String nacionalidade;
    private String email;

    public Autor(String nome, String nacionalidade, String email) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return String.format("(Nome: %s, Nacionalidade: %s, E-mail: %s)", nome, nacionalidade, email);
    }
}
