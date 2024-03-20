package PessoaFisicaEJuridica;

public class PessoaFisica extends Pessoa {

    private String CPF; 

    public PessoaFisica(String nome, String cpf) {
        super(nome); 
        this.CPF = cpf;
    }
    
    public String getCPF() {
        return CPF;
    }
}