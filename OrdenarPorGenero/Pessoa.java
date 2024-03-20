package OrdenarPorGenero;

public class Pessoa {
    private String nome; 
    private String genero; 

    Pessoa(String nome, String genero) {
        this.nome = nome;
        this.genero = genero; 
    }
    
    public String getGenero() {
        return genero; 
    }

    public String getNome() {
        return nome; 
    }

    public String toString() {
        return "Nome: " + nome;
    }

}