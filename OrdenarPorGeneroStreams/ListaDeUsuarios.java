package OrdenarPorGeneroStreams;

import java.util.Arrays;
import java.util.List;

public class ListaDeUsuarios {

    private ListaDeUsuarios() {

    }

    public static ListaDeUsuarios criarListaDeUsuarios() {
        return new ListaDeUsuarios();
    }

    Pessoa marco = new Pessoa("Marco", "masculino");
    Pessoa maria = new Pessoa("Maria", "feminino");
    Pessoa paula = new Pessoa("Paula", "feminino");
    Pessoa jose = new Pessoa("José", "masculino");

    private final List<Pessoa> listaDeUsuarios = Arrays.asList(marco, maria, paula, jose);

    public List<Pessoa> getListaDeUsuarios() {
        return listaDeUsuarios;
    }

}