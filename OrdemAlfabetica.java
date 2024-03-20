import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class OrdemAlfabetica {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> nomes = new ArrayList<>();
        System.out.println("Digite o nome ou 'sair' para sair");
        String input = scanner.nextLine();
        while ( !input.equals("sair") ) {
        nomes.add(input);
        System.out.println("Digite o nome ou 'sair' para sair");
        input = scanner.nextLine();
        }
        scanner.close();
        Collections.sort(nomes);
        nomes.forEach(nome -> System.out.println(nome));
    };

}