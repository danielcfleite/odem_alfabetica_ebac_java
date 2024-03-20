package OrdenarPorGenero;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrdenarPorGenero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Pessoa> usuarios = new ArrayList<>();
        
        String input;
        
        do {
            System.out.println("Por favor, digite um nome ou 0 para sair");
            input = scanner.nextLine();
        
            if (!input.equals("0")) {
                String nome = input; 
        
                System.out.println("Digite m para masculino ou F para feminino");
                input = scanner.nextLine();
        
                while (!input.equalsIgnoreCase("m") && !input.equalsIgnoreCase("f")) {
                   System.out.println("Favor inserir 'm' para masculino ou 'f' para feminino");
                    input = scanner.nextLine();
                }
        
                String genero = input.equalsIgnoreCase("m") ? "masculino" : "feminino"; 
                usuarios.add(new Pessoa(nome, genero));
            }
        } while (!input.equals("0"));

        scanner.close();

        List<Pessoa> usuariosMasculinos = new ArrayList<>();
        List<Pessoa> usuariosFemininos = new ArrayList<>();
        usuarios.forEach(usuario -> {
        if (usuario.getGenero().equals("masculino")) {
            usuariosMasculinos.add(usuario);
        } else {
            usuariosFemininos.add(usuario);
        }
        }
        );
        System.out.println("Usuários do gênero masculino:\n" );
        usuariosMasculinos.forEach(System.out::println);
        System.out.println("Usuários do gênero feminino:\n" );
        usuariosFemininos.forEach(System.out::println);
    }
}