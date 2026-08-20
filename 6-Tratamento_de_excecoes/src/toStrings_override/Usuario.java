package toStrings_override;

public class Usuario {
    int id;
    String nome;
    String cpf;
    
    public Usuario(int id, String nome, String cpf) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Usuario [id= " + id + ", nome= " + nome + ", cpf= " + cpf + "]";
    }

    
}