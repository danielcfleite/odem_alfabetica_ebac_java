package PessoaFisicaEJuridica;

public class PessoaJuridica extends Pessoa {
    private String CNPJ; 

    public PessoaJuridica(String nome, String cnpj) {
        super(nome); 
        this.CNPJ = cnpj;
    }
    
    public String getCPF() {
        return CNPJ;
    }
}
