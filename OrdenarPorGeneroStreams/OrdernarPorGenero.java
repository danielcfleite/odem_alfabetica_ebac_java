package OrdenarPorGeneroStreams;

import java.util.List;
import java.util.stream.Collectors;

public class OrdernarPorGenero {
    public static void main(String[] args) {
        ListaDeUsuarios listaDeUsuarios = ListaDeUsuarios.criarListaDeUsuarios();
        List<Pessoa> usuarios = listaDeUsuarios.getListaDeUsuarios();
        List<Pessoa> usuariosFemininos = usuarios.stream()
        .filter(e -> e.getGenero().equalsIgnoreCase("feminino"))
        .collect(Collectors.toList());

        usuarios.stream()
        .forEach(Utils.print());

        System.out.println("Usuários do gênero feminino :");

        usuariosFemininos.forEach(Utils.print());

    }
}
